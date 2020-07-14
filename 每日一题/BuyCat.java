package BaiDu;
import java.util.*;

/*度度熊想去商场买一顶帽子，商场里有N顶帽子，有些帽子的价格可能相同。
  度度熊想买一顶价格第三便宜的帽子，问第三便宜的帽子价格是多少？*/
public class BuyCat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> set= new TreeSet<>();
        for (int i=0;i<n;i++)
            set.add(in.nextInt());
        if(set.size()<3)
            System.out.println(-1);
        else
            System.out.println(set.toArray()[2]);
    }
}
