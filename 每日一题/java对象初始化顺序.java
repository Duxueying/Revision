
class Father {//这是父类
    public Father() {
        System.out.println("10、父类无参构造方法");//这是父类的无参构造方法
    }
    static {
        System.out.println("1、父类静态代码块1");//父类的第一个静态代码块
    }
    private static int a = TestClass.fatherStaticMemberVarInit();//父类的静态成员变量
    static {
        System.out.println("3、父类静态代码块2");
    }
    {
        System.out.println("7、父类普通代码块1");
    }
    private int b = TestClass.fatherMemberVarInit();//父类的普通成员变量
    {
        System.out.println("9、父类普通代码块2");
    }
    public Father(int v) {
        System.out.println("父类带参构造方法");
    }
}

class Son extends Father {
    static {
        System.out.println("4、子类静态代码块1");
    }
    private static int a = TestClass.sonStaticMemberVarInit();//子类静态成员变量
    static {
        System.out.println("6、子类静态代码块2");
    }
    {
        System.out.println("11、子类普通代码块1");
    }
    private int b = TestClass.sonMemberVarInit();//子类普通成员变量
    {
        System.out.println("13、子类普通代码块2");
    }
    public Son() {
        // super(2018);
        System.out.println("14、子类构造方法");
    }
}

class TestClass{
    public static int fatherStaticMemberVarInit() {
        System.out.println("2、父类静态成员变量");
        return 0;
    }
    public static int fatherMemberVarInit() {
        System.out.println("8、父类普通成员变量");
        return 0;
    }
    public static int sonStaticMemberVarInit() {
        System.out.println("5、子类静态成员变量");
        return 0;
    }
    public static int sonMemberVarInit() {
        System.out.println("12、子类普通成员变量");
        return 0;
    }
}

public class java对象初始化顺序 {
    public static void main(String[] args) {
        Son son1 = new Son();
        System.out.println("===================");
        Son son2 = new Son();
    }
}