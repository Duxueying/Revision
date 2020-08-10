package src.NiuKe;
/*public class single {
    //饿汉，主动找食物，一开始就吃掉
    private static single instance=new  single();
    private single(){
    }
    public static single getInstance(){
        return instance;
    }
}*/
public class single{
    //懒汉模式，需要的时候再去吃掉
    private single(){

    }
    private static single instance=null;
    public static single getInstance(){
        if(instance==null){
            instance=new single();
        }
        return instance;
    }
}
