import java.util.Scanner;
public class Fraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numerator1, denominator1;
        System.out.println("Enter the numerator: ");
        numerator1=scan.nextInt();
        System.out.println("Enter the denominator: ");
        denominator1=scan.nextInt();
        float deci=numerator1/denominator1;
        System.out.println("The decimal equivalent is:" + String.format("%5f",deci));
    }
}