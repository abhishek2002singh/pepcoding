import java.util.*;

public class digit {

    public static int calculateFrequence(int n1, int n2) {
        int mult = 1;
        int mult2 = 1;
        int mult3 = 1;
        int mult4 = 0;
        int diff = n1 - n2;
        if (n1 == n2) {
            return 1;
        } else {
            while (n1 > 0) {
                mult *= n1;
                n1--;
            }
            while (n2 > 0) {
                mult2 *= n2;
                n2--;
            }
            while (diff > 0) {
                mult3 *= diff;
                diff--;
            }
            mult4 = mult / mult2;
            mult4 = mult4 / mult3;
            return mult4;
        }

    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n1 = src.nextInt();
        int n2 = src.nextInt();
        System.out.println(calculateFrequence(n1, n2));
    }

}