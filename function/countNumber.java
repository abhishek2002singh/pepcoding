import java.util.*;

public class countNumber {

    public static int countNum(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int num = src.nextInt();
        System.out.println(countNum(num));
    }

}
