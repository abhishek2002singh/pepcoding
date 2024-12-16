import java.util.*;

public class requency {

    public static void countFrequence(int num, int target) {
        int count = 0;
        while (num > 0) {
            int compareValue = num % 10;
            if (compareValue == target) {
                count++;
            }
            num /= 10;

        }
        System.out.println("total number is " + count);
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = src.nextInt();
        System.out.println("please enter target number");
        int target = src.nextInt();
        countFrequence(num, target);
    }
}
