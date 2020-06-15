class Student{
private String name = "bit";//˽������
public int age = 18;//��������
public Student(){//���������Ĺ��췽��
        System.out.println("Student()");
        }
private Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String,name)");
        }

private void eat(){
        System.out.println("i am eat");
        }

public void sleep(){
        System.out.println("i am pig");
        }

private void function(String str) {
        System.out.println(str);
        }

@Override
public String toString() {
        return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
        }
        }

public class TestDemo {
    public static void main(String[] args) {
        /*1.ͨ��getClass��ȡClass����*/
        Student s1 = new Student();
        Class c1 = s1.getClass();
        /*2.ֱ��ͨ�� ����.class �ķ�ʽ�õ�,�÷�����Ϊ��ȫ�ɿ����������ܸ���
        ��˵���κ�һ���඼��һ�������ľ�̬��Ա����*/
        Class c2 = Student.class;
        /*3��ͨ�� Class ����� forName() ��̬��������ȡ���õ���࣬
        �������׳� ClassNotFoundException �쳣*/
        Class c3 = null;
        try {
            //ע�����������ȫ·��������а���Ҫ�Ӱ���·��
            c3 = Class.forName("Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //һ������ JVM ��ֻ����һ�� Class ʵ��,�����Ƕ������ȡ��
        //c1,c2,c3���� equals �Ƚϣ����ֶ���true
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));
    }
}
