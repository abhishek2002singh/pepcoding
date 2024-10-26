import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter a input length");
        int n = src.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(src.nextInt());
        }
    }
}