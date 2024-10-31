import java.util.*;

public class hcf {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int num1 = src.nextInt();
        int num2 = src.nextInt();
        while (num1 > 0) {

            if (num1 > num2) {
                int temp = num1 / num2;
                if (temp == 0) {
                    System.out.println("hcf is " + temp);
                    break;
                }
                num1 = num2;
                num2 = temp;
            }

            else {
                int temp = num2 / num1;
                if (temp == 0) {
                    System.out.println("hcf is " + temp);
                    break;
                }
                num2 = num1;
                num1 = temp;
            }

        }

    }
}
