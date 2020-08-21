package src.NiuKe.HuaWei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HJ8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int num=input.nextInt();
            TreeMap<Integer,Integer> map=new TreeMap<>();
            for(int i=0;i<num;i++){
                int key=input.nextInt();
                int value=input.nextInt();
                if(map.containsKey(key)){
                    map.put(key,map.get(key)+value);
                }else{
                    map.put(key,value);
                }
            }
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
