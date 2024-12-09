import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int len = (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                if (len >= i) {
                    if (j == 4 - i || j == 2 + i) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }

                } else {
                    if (j == i - 2 || j == 8 - i) {
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
