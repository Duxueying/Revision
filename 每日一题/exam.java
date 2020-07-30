package KeDaXunFei;
//华老师的n个学生参加了一次模拟测试，考出来的分数很糟糕，但是华老师可以将分数改为[0，100]的任意值，
// 所以他想知道，如果要使所有人的成绩平均分不少于X分，至少要改动多少人的分数。
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=0;//学生人数
        int avg=0;//平均分
        List<Integer> list2=new ArrayList<>();
        while(input.hasNext()){
            int number=input.nextInt();//输入几组数组
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<number;i++){
                num=input.nextInt();//输入学生和平均分
                avg=input.nextInt();
                for(int j=0;j<num;j++){//循环输入学生成绩
                    list.add(input.nextInt());//把这组学生分数放到list里面
                }//到这里输入完成
                ArrayList<Integer> array1=(ArrayList<Integer>) difference(list);
                //将学生的这组分数进行求差排序；
                list2.add(update(avg,list,array1));
                list.clear();
                array1.clear();
            }

            for(int i=0;i<list2.size();i++){
                System.err.println(list2.get(i));
            }
        }
        input.close();
    }
    //返回需要改动的数字个数
    public static int update(int avg, List<Integer> list,ArrayList<Integer> array2){
        int len1=list.size();//学生分数那个数组的长度
        int len2=array2.size()-1;
        int sum1=0;
        int sum2=avg*len1;//60*5=300；总分至少到300才可以到目标值
        int number=0;
        for(int i=0;i<len1;i++){
            sum1=sum1+list.get(i);//把学生考的成绩总总加起来299
        }
        int difference=sum2-sum1;//需要补一分就可以实现
        if(0>difference){
            return 0;
        }
        else{
            while(difference>0){
                number++;
                difference=difference-array2.get(len2);
                len2=len2-1;
            }
        }
        return number;
    }
    //将输入的数组进行求差并排序，
    public static List<Integer> difference(List<Integer> list){
        List<Integer> tempArray=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            tempArray.add(100-list.get(i));//计算每个人离100还差多少分；
        }
        Collections.sort(tempArray);//在进行排序；这是，tempArray里面的数据就是0  10 40 70  80
        return tempArray;
    }
}
