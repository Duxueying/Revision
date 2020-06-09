import java.util.*;

public class Train {
    public static Stack<String> stack=new Stack<String>();
    public static Stack<String> list=new Stack<String>();
    public static List<String> results=new ArrayList<String>();

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();//����������ͽ������
        input.nextLine();
        String str=input.nextLine();
        process(str);
    }

    public static void process(String str){
        String[] trains=str.split(" ");//�Կո񻮷ַ�������ַ���������
        for(int i=trains.length-1;i>=0;i--){
            list.push(trains[i]);//�ѻ𳵷������List����
        }
        solution(" ");
        Collections.sort(results);
        for(String result:results) {
            System.out.println(result);
        }

    }

    public static void solution(String out){
        if(stack.isEmpty()&&list.isEmpty()){//������Ϊ�գ�˵��û�н�����
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
