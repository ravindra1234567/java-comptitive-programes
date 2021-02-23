import java.util.Scanner;

class Ifelse{
    public static void main(String adj[]){
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
        System.out.println((a & 1) == 0 ? "Even":"Odd");
    }
}