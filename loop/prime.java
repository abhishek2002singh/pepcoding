import java.util.*;

public class prime {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 2; i < 20; i++) {
            for (j = 2; j < i; j++)
                if (i % j == 0) {
                    break;
                }
            if (i == j) {
                System.out.println(i);
            }

        }
    }
}
