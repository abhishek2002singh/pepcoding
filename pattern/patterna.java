import java.util.*;

public class patterna {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // if (j == 6 - i) {
                // System.out.print("*");
                // } else {
                // System.out.print("-");
                // }
                if (j + i == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();

        }
    }

}
