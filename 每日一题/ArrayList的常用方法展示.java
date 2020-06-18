package lab;
import java.util.List;
import java.util.ArrayList;
public class ArrayList的常用方法展示 {
    public static void main(String[] args) {
        List<String> course=new ArrayList<>();
        course.add("计算机网络");//添加一个元素，add方法展示
        course.add("数据结构");
        course.add("JAVA语言");
        System.out.println(course);

        //get方法展示，在参数中传入索引
        System.out.println(course.get(0));

        //size方法展示
        System.out.println(course.size());

        //set设置方法展示
        course.set(0, "计算机基础");
        System.out.println(course);

        //remove删除方法展示
       course.remove(2);
       System.out.println(course);

        //subList截取部分方法
        List<String> subCourse = course.subList(0,2 );
        System.out.println(subCourse);
    }
}
