
import java.util.*;
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.text.DecimalFormat;

public class Calculator {


    private static final Logger logger = LogManager.getLogger(Calculator.class);

    static double a,b,c;
    static int choice;
    static boolean check=true;
    static Scanner sc=new Scanner(System.in);

    public static void main (String args[]) throws IOException{

        while(check){
                System.out.println("Press 1:Square Root,\t 2:Factorial,\t 3:Natural Logarithm,\t 4:Power Funtion,\t 5:Exit");
                System.out.print("Enter your choice:");
                try {
                    choice = scanner.nextInt();
                }
                catch (InputMismatchException error) {
                    System.out.println("Invalid input entered.");
                    return;
                }
                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter a number for calculating square-root::");
                            a = sc.nextDouble();
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input, entered input is not a number");
                            return;
                        }

                        c = sqrt(a);
                        if (c < 0)
                            System.out.println("Square root of negative number can not be calculated");
                        else
                            System.out.println("The resultant output is: " + c);
                        break;
                    case 2:
                        try {
                            System.out.print("Enter a number for calculating factorial::");
                            int f = sc.nextInt();
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input, entered input is not a number");
                            return;
                        }
                        long fac = fact(f);
                        if (fac < 0)
                            System.out.println("Factorial of negative number can not be calculated");
                        else
                            System.out.println("Answer is: " + fac);
                        break;
                    case 3:
                        try {
                            System.out.print("Enter a number for calculating natural-logarithm::");
                            double a = sc.nextDouble();
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input, entered input is not a number");
                            return;
                        }
                        c = log(a);
                        if (c < 0)
                            System.out.println("Input number can not be less than or equal to zero for finding log");
                        else
                            System.out.println("The resultant output is: " + c);
                        break;
                    case 4:
                        try {
                            System.out.print("Enter two numbers separated by space for calculating power(a^b: a b)::");
                            a = sc.nextDouble();
                            b = sc.nextDouble();
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input, entered input is not a number");
                            return;
                        }
                        c = pow(a, b);
                        System.out.println("The resultant output is: " + c);
                        break;
                    case 5:
                        System.out.println("Thank you for using calculator;Have a nice day!!!!");
                        check = false;
                        break;
                    default:
                        try {
                            System.out.println("XXXXX @@Wrong choice entered,please enter a valid number@@ XXXXXX");
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input, entered input is not a number");
                            return;
                        }
                }

        }
      }

    public static double sqrt(double a){
        if(a<0){
            return -1;
        }
        c=Math.sqrt(a);
        return c;
    }
    public static long fact(int f){
        if(f<0){
            return -1;
        }
        if(f<2) return 1;
        return f*fact(f-1);
    }
    public static double log(double a){
        if(a<=0){
            return -1;
        }
        c=Math.log(a);
        return c;
    }
    public static double pow(double a, double b){
        c=Math.pow(a,b);
        return c;
    }
}
