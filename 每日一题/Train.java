import java.util.*;

public class Train {
    public static Stack<String> stack=new Stack<String>();
    public static Stack<String> list=new Stack<String>();
    public static List<String> results=new ArrayList<String>();

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();//输入火车数量和进入序号
        input.nextLine();
        String str=input.nextLine();
        process(str);
    }

    public static void process(String str){
        String[] trains=str.split(" ");//以空格划分放在这个字符串数组里
        for(int i=trains.length-1;i>=0;i--){
            list.push(trains[i]);//把火车放在这个List里面
        }
        solution(" ");
        Collections.sort(results);
        for(String result:results) {
            System.out.println(result);
        }

    }

    public static void solution(String out){
        if(stack.isEmpty()&&list.isEmpty()){//两个都为空，说明没有进来火车
            results.add(out.trim());
            return;
        }
        if(!stack.isEmpty()){//
            String str=stack.pop();
            solution(out+" "+str);
            stack.push(str);
        }
        if (!list.isEmpty()) {
            String str = list.pop();
            stack.push(str);
            solution(out);
            stack.pop();
            list.push(str);
        }
    }
}
