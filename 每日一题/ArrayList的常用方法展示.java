package lab;
import java.util.List;
import java.util.ArrayList;
public class ArrayList�ĳ��÷���չʾ {
    public static void main(String[] args) {
        List<String> course=new ArrayList<>();
        course.add("���������");//���һ��Ԫ�أ�add����չʾ
        course.add("���ݽṹ");
        course.add("JAVA����");
        System.out.println(course);

        //get����չʾ���ڲ����д�������
        System.out.println(course.get(0));

        //size����չʾ
        System.out.println(course.size());

        //set���÷���չʾ
        course.set(0, "���������");
        System.out.println(course);

        //removeɾ������չʾ
       course.remove(2);
       System.out.println(course);

        //subList��ȡ���ַ���
        List<String> subCourse = course.subList(0,2 );
        System.out.println(subCourse);
    }
}
