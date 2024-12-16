import java.util.*;

public class different {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter the lenght of array");
        int len = src.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = src.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                max = array[i];
            }
        }
        int different = max - min;
        System.out.println("different maximum value = " + different);
    }
}
