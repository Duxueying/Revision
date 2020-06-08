import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class countRabbit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = br.readLine()) != null) {
            int month = Integer.parseInt(s);
            int[] arr= new int[month + 1];
            arr[1] = 1; arr[2] = 1;
            for (int i = 3; i <= month; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.println(arr[month]);
        }
    }
}
