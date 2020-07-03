package api;

import dao.Image;
import dao.ImageDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;

public class ImageShowServlet extends HttpServlet {
    static private HashSet<String> whiteList = new HashSet<>();

    static {
        whiteList.add("http://127.0.0.1:7070/java_image_server/index.html");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*String referer = req.getHeader("Referer");
        if (!whiteList.contains(referer)) {
            resp.setContentType("application/json; charset: utf-8");
            resp.getWriter().write("{ \"ok\": false, \"reason\": \"wei shouquan de fangwen\" }");
            return;
        }*/
        // 1. ������ imageId
        String imageId = req.getParameter("imageId");
        if (imageId == null || imageId.equals("")) {
            resp.setContentType("application/json; charset: utf-8");
            resp.getWriter().write("{ \"ok\": false, \"reason\": \"imageId Resolution failure\" }");
            return;
        }
        // 2. ���� imageId �������ݿ�, �õ���Ӧ��ͼƬ������Ϣ(��Ҫ֪��ͼƬ�洢��·��)
        ImageDao imageDao = new ImageDao();
        Image image = imageDao.selectOne(Integer.parseInt(imageId));
        // 3. ����·�����ļ�, ��ȡ���е�����, д�뵽��Ӧ������
        resp.setContentType(image.getContentType());
        File file = new File(image.getPath());
        // ����ͼƬ�Ƕ������ļ�, Ӧ��ʹ���ֽ����ķ�ʽ��ȡ�ļ�
        OutputStream outputStream = resp.getOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        while (true) {
            int len = fileInputStream.read(buffer);
            if (len == -1) {
                // �ļ���ȡ����
                break;
            }
            // ��ʱ�Ѿ�����һ��������, �ŵ� buffer ��, �� buffer �е�����д����Ӧ������
            outputStream.write(buffer);
        }
        fileInputStream.close();
        outputStream.close();
    }
}
