import java.util.*;

public class pattern11 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(" " + count++ + " ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();

        }
    }
}