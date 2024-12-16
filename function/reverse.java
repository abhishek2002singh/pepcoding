import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int length = src.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = src.nextInt();
        }
        int st = 0;
        int end = array.length - 1;
        while (st < end) {
            int swap = array[end];
            int swap2 = array[st];
            array[st] = swap;
            array[end] = swap2;
            st++;
            end--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("array element = " + array[i]);
        }

    }
}
