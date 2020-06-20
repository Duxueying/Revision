package day6_20;

/**题目描述**：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
（先后次序不同算不同的结果）解题思路**：当台阶数小于等于2的时候，跳法数就等于台阶数，大于等于3时跳法
 就是前两个台阶之和。即f(n) = f(n-1) + f(n-2)假设现在6个台阶，我们可以从第5跳一步到6，这样的话有多少
 种方案跳到5就有多少种方案跳到6，另外我们也可以从4跳两步跳到6，跳到4有多少种方案的话，就
 有多少种方案跳到6，所以最后就是f(6) = f(5) + f(4)*/
public class JZ8 {
    public int JumpFloor(int target) {
        if(target<=2){
            return target;
        }
        int first=1,sencond=2;
        int method=0;
        for(int i=2;i<target;i++){
            method=first+sencond;
            first=sencond;
            sencond=method;
        }
        return method;
    }
}
