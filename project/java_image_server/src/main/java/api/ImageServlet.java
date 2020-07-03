package api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.Image;
import dao.ImageDao;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ImageServlet extends HttpServlet {
    /**
     * �鿴ͼƬ����: ���ܲ鿴����, Ҳ�ܲ鿴ָ��
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // ���ǵ��鿴����ͼƬ���ԺͲ鿴ָ��ͼƬ����
        // ͨ���Ƿ� URL �д��� imageId ��������������.
        // ���� imageId �鿴ָ��ͼƬ����, ����Ͳ鿴����ͼƬ����
        // ����: URL /image?imageId=100
        // imageId ��ֵ���� "100"
        // ��� URL �в����� imageId ��ô���� null
        String imageId = req.getParameter("imageId");//��ÿͻ������õ�����
        if (imageId == null || imageId.equals("")) {
            // �鿴����ͼƬ����
            selectAll(req, resp);
        } else {
            // �鿴ָ��ͼƬ
            selectOne(imageId, resp);
        }
    }

    private void selectAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json; charset=utf-8");//���÷��͵��ͻ��˵���Ӧ��������
        // 1. ����һ�� ImageDao ����, ���������ݿ�
        ImageDao imageDao = new ImageDao();
        List<Image> images = imageDao.selectAll();
        // 2. �Ѳ��ҵ��Ľ��ת�� JSON ��ʽ���ַ���, ����д�ظ� resp ����
        Gson gson = new GsonBuilder().create();
        //    jsonData ����һ�� json ��ʽ���ַ�����, �ͺ�֮ǰԼ���ĸ�ʽ��һ������.
        //    �ص�����������д���, ��������ĺ���, gson �������Զ�����˴����ĸ�ʽת������
        //    ֻҪ��֮ǰ����ص��ֶζ�Լ����ͳһ������, ����Ĳ����Ϳ���һ����λ���������ת��
        String jsonData = gson.toJson(images);
        resp.getWriter().write(jsonData);//��������������ҳ�棬ֱ����ҳ���������
    }

    private void selectOne(String imageId, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json; charset=utf-8");
        // 1. ���� ImageDao ����
        ImageDao imageDao = new ImageDao();
        Image image = imageDao.selectOne(Integer.parseInt(imageId));
        // 2. ʹ�� gson �Ѳ鵽������ת�� json ��ʽ, ��д�ظ���Ӧ����
        Gson gson = new GsonBuilder().create();
        String jsonData = gson.toJson(image);
        resp.getWriter().write(jsonData);
    }

    /**
     * �ϴ�ͼƬ
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. ��ȡͼƬ��������Ϣ, ���Ҵ������ݿ�
        //  a) ��Ҫ����һ�� factory ���� �� upload ����, ����Ϊ�˻�ȡ��ͼƬ��������׼������
        //     �̶����߼�
        FileItemFactory factory = new DiskFileItemFactory();//ʵ���ļ��ϴ�
        ServletFileUpload upload = new ServletFileUpload(factory);
        // b) ͨ�� upload �����һ����������(����HTTP��������ֵ� body �е�����)
        //    FileItem �ʹ���һ���ϴ����ļ�����.
        //    ��������˵, HTTP ֧��һ��������ͬʱ�ϴ�����ļ�
        List<FileItem> items = null;
        try {
            items = upload.parseRequest(req);
        } catch (FileUploadException e) {
            // �����쳣˵����������!
            e.printStackTrace();
            // ���߿ͻ��˳��ֵľ���Ĵ�����ɶ
            resp.setContentType("application/json; charset=utf-8");
            resp.getWriter().write("{ \"ok\": false, \"reason\": \"jiexi failed\" }");
            return;
        }
        //  c) �� FileItem �е�������ȡ����, ת���� Image ����, ���ܴ浽���ݿ���
        //     ��ǰֻ����һ��ͼƬ�����
        FileItem fileItem = items.get(0);//FileItem����һ���ӿڣ�����ʵ������DiskFileItem
        Image image = new Image();
        image.setImageName(fileItem.getName());
        image.setSize((int)fileItem.getSize());
        // �ֶ���ȡһ�µ�ǰ����, ��ת�ɸ�ʽ������, yyMMdd => 20200218
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");//ѡ���û������ʱ��
        image.setUploadTime(simpleDateFormat.format(new Date()));
        image.setContentType(fileItem.getContentType());
        // MD5 ��ʱ�Ȳ�ȥ����
        image.setMd5(DigestUtils.md5Hex(fileItem.get()));
        // �Լ�����һ��·��������, ����ʱ�����Ϊ�����ļ�·���ܹ�Ψһ
        image.setPath("./image/" + image.getMd5());
        // �浽���ݿ���
        ImageDao imageDao = new ImageDao();

        // �������ݿ����Ƿ������ͬ�� MD5 ֵ��ͼƬ, ������, ���� null
        Image existImage = imageDao.selectByMd5(image.getMd5());

        imageDao.insert(image);

        // 2. ��ȡͼƬ��������Ϣ, ����д������ļ�
        if (existImage == null) {
            File file = new File(image.getPath());
            try {
                fileItem.write(file);
            } catch (Exception e) {
                e.printStackTrace();

                resp.setContentType("application/json; charset=utf-8");
                resp.getWriter().write("{ \"ok\": false, \"reason\": \"Write disk failed\" }");
                return;
            }
        }

        // 3. ���ͻ��˷���һ���������
        //resp.setContentType("application/json; charset=utf-8");
       // resp.getWriter().write("{ \"ok\": true }");
        resp.sendRedirect("index.html");
        //http://192.168.3.24:8080/java_image_server/index.html
    }

    /**
     * ɾ��ָ��ͼƬ
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json; charset=utf-8");
        // 1. �Ȼ�ȡ�������е� imageId
        String imageId = req.getParameter("imageId");//��ȡ�ͻ������������
        if (imageId == null || imageId.equals("")) {
            resp.setStatus(200);
            resp.getWriter().write("{ \"ok\": false, \"reason\": \"jiexi failed\" }");
            return;
        }
        // 2. ���� ImageDao ����, �鿴����ͼƬ�����Ӧ���������(����Ϊ��֪�����ͼƬ��Ӧ���ļ�·��)
        ImageDao imageDao = new ImageDao();
        Image image = imageDao.selectOne(Integer.parseInt(imageId));
        if (image == null) {
            // ��ʱ�����д���� id �����ݿ��в�����.
            resp.setStatus(200);
            resp.getWriter().write("{ \"ok\": false, \"reason\": \"imageId not exist in db\" }");
            return;
        }
        // 3. ɾ�����ݿ��еļ�¼
        imageDao.delete(Integer.parseInt(imageId));
        // 4. ɾ�����ش����ļ�
        File file = new File(image.getPath());
        file.delete();
        resp.setStatus(200);
        resp.getWriter().write("{ \"ok\": true }");
    }
}