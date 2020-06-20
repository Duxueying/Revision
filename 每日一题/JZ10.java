package day6_20;
public class JZ10{
    public int RectCover(int target) {
        int two=2,three=3;
        if(target<=3){//小于3是就是本身
            return target;
        }
        int result=0;
        for(int i=4;i<=target;i++){//从4开始，依旧斐波那契
            result=two+three;
            two=three;
            three=result;
        }
        return result;
    }
}