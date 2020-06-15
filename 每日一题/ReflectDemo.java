import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class ReflectDemo{
    public static void reflectNewInstance(){//��������
        try{
            Class<?> classStudent=Class.forName("student");
            Object objectStudent=classStudent.newInstance();
            Student student=(Student)objectStudent;
            System.out.println("���ѧ������"+student);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void reflectPrivateConstructor(){//����˽�й��췽��
        try {
            Class<?> classStudent = Class.forName("Student");
            //ע�⴫���Ӧ�Ĳ���
            Constructor<?> declaredConstructorStudent = classStudent.getDeclaredConstructor(String.class,int.class);
            //Constructor<?> declaredConstructorStudent = classStudent.getConstructor();
            //����Ϊtrue����޸ķ���Ȩ��
            declaredConstructorStudent.setAccessible(true);
            Object objectStudent = declaredConstructorStudent.newInstance("�߲�",15);
            //Object objectStudent = declaredConstructorStudent.newInstance();
            Student student = (Student) objectStudent;
            System.out.println("���˽�й��캯�����޸����������䣺"+student);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // ����˽������
    public static void reflectPrivateField() {
        try {
            Class<?> classStudent = Class.forName("Student");

            Field field  = classStudent.getDeclaredField("name");
            field.setAccessible(true);
            //�����޸ĸ����Ե�ֵ
            Object objectStudent = classStudent.newInstance();
            Student student = (Student) objectStudent;

            field.set(student,"С��");

            String name = (String) field.get(student);
            System.out.println("����˽�������޸���name��"+ name);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // ����˽�з���
    public static void reflectPrivateMethod() {
        try {
            Class<?> classStudent = Class.forName("Student");
            Method methodStudent = classStudent.getDeclaredMethod("function",String.class);
            System.out.println("˽�з����ķ�����Ϊ��"+methodStudent.getName());
            //˽�е�һ�㶼Ҫ��
            methodStudent.setAccessible(true);
            Object objectStudent = classStudent.newInstance();
            Student student = (Student) objectStudent;
            methodStudent.invoke(student,"���Ǹ�˽�е�function�������Ĳ���");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //reflectNewInstance();
        //reflectPrivateConstructor();
        //reflectPrivateField();
        reflectPrivateMethod();

    }
}