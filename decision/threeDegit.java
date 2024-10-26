import java.util.*;

public class threeDegit {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int count = 0;
        int num = src.nextInt();
        while (num > 0) {
            num /= 10;
            count++;
        }

        if (count >= 3) {
            System.out.println("digit is three");
        } else {
            System.out.println("not three digit");
        }
    }
}
