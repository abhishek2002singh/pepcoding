import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int len = (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (len >= i) {
                    if (j >= (len + 1 - i) && (j <= 2 + i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= (n + i - (n + 2)) && (j <= (2 * n) - (i + 2))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
    }
}
