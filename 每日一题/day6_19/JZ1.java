package day6_19;
/*题目描述**：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
判断数组中是否含有该整数。
解题思路：这个题相对比较简单，两个for循环，一个控制数组长度，一个控制每个arr[i]的长度，找到就返回true;*/
public class JZ1{
    public static boolean Find(int target,int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;i++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}