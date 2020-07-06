import java.util.HashMap;
public class length2{
    public static void main(String[] args) {
        int[] a = {6, 7, 2, 2, 2, 2, 2, 3, 4};
        int left=0;
        int right=a.length-1;
        int mid=a.length/2;
        int index=solution3(a,left,right);
        while(index!=mid){
            if(index>mid){
                right=index-1;
                index=solution3(a,left,right);
            }else{
                left=index=+1;
                index=solution3(a,left,right);
            }
        }
        int result= a[mid];
        System.out.println(result);
        // int result=solution2(a);
    }
    public static int solution3(int[] b,int begin,int end){
        int key=b[begin];
        while(begin<end){
            while(begin<end&&b[end]>=key){
                end--;
                //b[begin]=b[end];
            }
            b[begin]=b[end];
            while(begin<end&&b[begin]<=key){
                begin++;
                //b[end]=b[begin];
            }
            b[end]=b[begin];
            ///b[begin]=key;
        }
        b[begin]=key;
        return begin;
    }
}
   /* public static void solution2(int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < b.length; i++) {
            if (!map.containsKey(b[i])) {
                map.put(b[i], 1);
            } else {
                int value = map.get(b[i]);//get返回key对应的value
                map.put(b[i], value++);
            }
        }
        int j = 0, result = 0;
        for (j = 0; j < map.size(); j++) {
            if(map.get(b[j]) > b.length / 2) {
                break;
            }
        }
        System.out.println(b[j]);
    }
}

    /*public static int solution1(int[] b){
        //O(nlgn)
        Arrays.sort(b);
        int start=0,end=b.length-1;
        int mid=(end-start)/2;
        return b[mid];
    }*/
