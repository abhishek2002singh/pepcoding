import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int len = (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 3; j++) {
                if (len >= i) {
                    if (j >= 5 - i && j <= 3 + i) {
                        System.out.print(" ");

                    } else {
                        System.out.print("*");
                    }

                } else {
                    if (j > i - len + 1 && j < 2 * n - 3 - (i - len)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();

        }
    }

}
