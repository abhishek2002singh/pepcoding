import java.util.*;

public class divide5 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int num = src.nextInt();
        if (num % 5 == 0) {
            System.out.println("divided by 5");
        } else {
            System.out.println("not divided by 5");
        }
    }
}
