import java.util.*;

public class pattern6 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2 * n; j++) {
                if (j >= i && j <= 2 * n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
