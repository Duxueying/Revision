public class JumpGame{
    public static void main(String[] args) {
        int[] arr= {2,3,0,5,6};
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int[] nums) {
        int steps= 1;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] >= steps){
                steps=1;
            }else{
                steps++;
            }
            if(i==0 && steps>1){
                return false;
            }
        }
        return true;
    }
}
