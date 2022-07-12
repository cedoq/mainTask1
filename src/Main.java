import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    static BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int sum = 0;
        String i = "0";
        while(!Objects.equals(i, "stop")) {
            sum += Integer.parseInt(i);
            i = bR.readLine();
        }
        System.out.println(sum);
    }
}