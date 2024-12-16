import java.util.*;

public class rotateArray {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int lenght = src.nextInt();
        int[] array = new int[lenght];
        System.out.println("enter element in array");
        for (int i = 0; i < array.length; i++) {
            array[i] = src.nextInt();
        }
        System.out.println("enput target value");
        int k = src.nextInt();
        int lenght2 = array.length - k;
        int st = 0;
        int end = lenght2 - 1;
        while (st < end) {
            int temp = array[st];
            array[st] = array[end];
            array[end] = temp;
            st++;
            end--;

        }
        st = lenght2;
        end = array.length - 1;
        while (st < end) {
            int temp = array[st];
            array[st] = array[end];
            array[end] = temp;
            st++;
            end--;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("final output");
        st = 0;
        end = array.length - 1;
        while (st < end) {
            int temp = array[st];
            array[st] = array[end];
            array[end] = temp;
            st++;
            end--;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

}
