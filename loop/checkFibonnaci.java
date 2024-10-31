import java.util.*;

public class checkFibonnaci {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int num = src.nextInt();
        int x = 0;
        int y = 1;
        int z = 0;
        if (num >= 2) {
            System.out.println(x + " " + y);
        }
        for (int i = 2; i < num; i++) {
            z = x + y;
            System.out.println(z + " ");
            x = y;
            y = z;
        }
    }
}
