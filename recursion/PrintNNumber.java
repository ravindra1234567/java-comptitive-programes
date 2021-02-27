import java.util.*;

public class PrintNNumber {

    public static void reverseOrder(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        reverseOrder(n - 1);

    }

    public static void increasingOrder(int num) {
        if (num == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(num);
        increasingOrder(num-1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();

        reverseOrder(5);
        System.out.println("x");
        increasingOrder(5);

    }
}