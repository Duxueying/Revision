package day6_20;
/**解题思路**：两个循环从前往后去遍历，遇到奇数偶数就交换*/
public class JZ13{
    public void reOrderArray(int [] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}