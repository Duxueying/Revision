package src.NiuKe.HuaWei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//找出第一个只出现一次的字符，
// asdfasdfo  aabb   o -1
public class HJ59 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String str=input.nextLine();
            Map<Character,Integer> map=new HashMap<>();
            char[] arr=str.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }else{
                    map.put(arr[i],1);
                }
            }
            for(Map.Entry<Character,Integer> entry:map.entrySet()){
                if(entry.getValue()==1){
                    System.out.println(entry.getKey());
                    break;
                }
            }
            System.out.println(-1);
        }
    }
}
