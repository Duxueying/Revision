package LeetCode;

public class mySqrt_69 {
    public int mySqrt(int x) {
        if (x == 1 || x == 0) {//1和0都返回自身
            return x;
        }
        int start = 1;
        int end = x / 2 + 1;//右边肯定在自身除以二之内
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            //防止越界
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            }
            if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return mid;
    }
}
