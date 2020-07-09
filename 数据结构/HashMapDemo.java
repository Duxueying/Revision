

import java.util.HashMap;
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();//定义一个map
        map.put("李白", "1");//存放键值对
        System.out.println(map.containsKey("李白"));//键中是否包含这个数据,打印结果为true
        System.out.println(map.containsKey("王维"));//打印结果为false

        System.out.println(map.get("李白"));//通过键拿值,打印结果是1
        System.out.println(map.get("王维"));//打印结果为null

        System.out.println(map.isEmpty());//判空，打印结果为false
        System.out.println(map.size());//输出map的大小，打印结果为1
        System.out.println(map.remove("李白"));//从键值中删除.打印结果为1
        System.out.println(map.containsKey("李白"));//删除了所以不包含了，输出false
        System.out.println(map.isEmpty());//现在就为空是，输出true

        map.put("杜甫", "2");
        System.out.println(map.get("杜甫"));
        map.put("陶渊明", "3");
        System.out.println(map.get("陶渊明"));

        map.put("杜甫", "4");
        map.put("陶渊明", "6");

        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("=========================");

        for (String values : map.values()) {
            System.out.println(values);
        }
    }
}