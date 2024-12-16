import java.util.*;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter first array length");
        int length1 = src.nextInt();
        int[] array1 = new int[length1];
        System.out.println("enter second array length");
        int length2 = src.nextInt();
        int[] array2 = new int[length2];
        System.out.println("enter first array element");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = src.nextInt();
        }
        System.out.println("enter second array element");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = src.nextInt();
        }
        int additionalsum = 0;
        if (length1 > length2) {
            for (int i = 0; i < array2.length; i++) {
                array1[i] = array1[i] + array2[i];
            }
            for (int i = 0; i < array1.length; i++) {
                System.out.println("sum of  array is = " + array1[i]);
            }

        } else if (length1 < length2) {
            for (int i = 0; i < array1.length; i++) {
                array2[i] = array1[i] + array2[i];
            }
            for (int i = 0; i < array2.length; i++) {
                System.out.println("sum of  array is = " + array2[i]);
            }
        } else {
            if (length1 == length2) {
                for (int i = 0; i < array1.length; i++) {
                    array1[i] = array1[i] + array2[i];
                }
            }
            for (int i = 0; i < array2.length; i++) {
                System.out.println("sum of  array is = " + array1[i]);
            }

        }

    }
}
