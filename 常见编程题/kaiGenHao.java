package src.NiuKe;

public class kaiGenHao {
    public static void main(String[] args) {
        double m=100;
        double i=0;
        int k=0;
        while((i*i)<=m){
            i=i+0.1;
        }
        for(int j=0;j<10;j++){
            i=(m/i+i)/2;
        }
       System.out.println(i);
    }
}
