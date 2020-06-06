public class ChageMoney {
    public static void main(String[] args) {
        double guest=0;
        int rich=0;
        for(int i=1;i<=30;i++){
            guest=guest+Math.pow(2,i-1);
            rich =rich+10;
        }
        System.out.println(guest+" "+rich);
    }
}
