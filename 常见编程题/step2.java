package src.niuKe;

public class step2 {
    public int jump(int target){
        if(target>0&&target<=2)
            return target;
        if(target==0)
            return 1;
        int sum=0;
        for(int i=0;i<=target;i++){
            sum=sum+jump(target-1);
        }
        return sum;
    }
}
