package GuangLianDa;
//单例模式：请设计一个类，该类在同一个进程中只能由一个实例，且该实例允许外部访问。
public class DesignClass {
    //声明一个静态变量
    private static DesignClass instance;
    //构造器
    private DesignClass(){

    }
    public  static DesignClass getInstance(){
        if(instance==null){
            instance=new DesignClass();
        }
        return instance;
    }
}
