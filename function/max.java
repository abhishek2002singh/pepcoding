import java.util.*;

public class max {

    public static int maxNumber(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter the lenght of array");
        int lenght = src.nextInt();
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = src.nextInt();
        }
        System.out.println(maxNumber(array));
    }
}
