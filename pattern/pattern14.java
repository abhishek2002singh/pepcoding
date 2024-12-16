import java.util.*;

public class pattern14 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int count = 1;
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1) {
                    System.out.print("x");
                } else if (j == 2) {
                    System.out.print("*");
                } else if (j == 3) {
                    System.out.print(count++);
                } else if (j == 4) {
                    System.out.print("=");
                } else if (j == 5) {
                    System.out.print(mul++ + "x");
                }

            }
            System.out.println();

        }
    }
}
