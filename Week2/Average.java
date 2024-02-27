import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
       int value1, value2, value3;
       double average;
       Scanner scan = new Scanner(System.in) ;


       // get three values from user
       System.out.println("Please enter three integers and " +
                       "I will compute their average.");

       System.out.println("Enter the first value:");
       value1 = scan.nextInt();
       System.out.println("Enter the second value:");
       value2 = scan.nextInt();
       System.out.println("Enter the third value:");
       value3 = scan.nextInt();
       average=(value1+value2+value3)/3.0;
       System.out.println("The average is "+ average  +".") ;   

    }
}


