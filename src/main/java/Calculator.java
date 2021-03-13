
import java.util.*;
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.text.DecimalFormat;

public class Calculator {


    private static final Logger logger= LogManager.getLogger(Calculator.class);

    static double a,b,c;
    static int choice;
    static boolean check=true;
    static Scanner sc=new Scanner(System.in);

    public static void main (String args[]){
        while(check){
                System.out.println("---Press a key according to given options---\n 1:Square Root \t 2:Factorial \t 3:Natural Logarithm \t 4:Power Funtion \t 5:Exit");
                System.out.print("Enter your choice:::");
                try {
                    choice = sc.nextInt();
                }
                catch (InputMismatchException error) {
                    System.out.println("Invalid input entered!!!");
                    return;
                }
                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter a number for calculating square-root:::");
                            a = sc.nextDouble();
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input, entered input is not a number!!!");
                            return;
                        }
                        if (a < 0)
                            System.out.println("Square root of negative number can not be calculated!!!");

                        else
                            System.out.println("The resultant output is: " +sqrt(a));
                        break;
                    case 2:
                        int f;
                        try {
                            System.out.print("Enter a number for calculating factorial:::");
                            f = sc.nextInt();
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input, entered input is not a number!!!");
                            return;
                        }
                        if (f < 0)
                            System.out.println("Factorial of negative number can not be calculated!!!");
                        else
                            System.out.println("The resultant output is: " +fact(f));
                        break;
                    case 3:
                        try {
                            System.out.print("Enter a number for calculating natural-logarithm:::");
                            a = sc.nextDouble();
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input, entered input is not a number!!!");
                            return;
                        }
                        if (a < 0)
                            System.out.println("Input number can not be less than or equal to zero for finding log!!!");
                        else
                            System.out.println("The resultant output is: " +log(a));
                        break;
                    case 4:
                        try {
                            System.out.print("Enter two numbers separated by space for calculating power(a^b: a b):::");
                            a = sc.nextDouble();
                            b = sc.nextDouble();
                        } catch (InputMismatchException error) {
                            logger.error("Invalid input, entered input is not a number!!!");
                            return;
                        }
                        c = pow(a, b);
                        System.out.println("The resultant output is: " + c);
                        break;
                    case 5:
                        System.out.println("!!!Thank you for using calculator;Have a nice day!!!");
                        check = false;
                        break;
                    default:
                            System.out.println("XXXXX @@Wrong choice entered,please enter a valid number@@ XXXXXX");
                            return;
                        }
                }
        }

    public static double sqrt(double a){
            double c=0;
            logger.info("Calculating square root  of given number:" + a);
            if(a<0)
                c=-1;
            else
                c = Math.sqrt(a);
            logger.info("Resultant answer of power operations is : " + c);
            return c;
    }
    public static Double fact(int f){
            double result = 1;
            logger.info("Calculating factorial  of given number:" + f);
            if(f<0)
                result=-1;
            else {
                try {
                    if (f == 0 || f == 1) return 1.0;

                    for (int i = 1; i <= f; i++) {
                        result *= i;
                    }
                }
                catch (Exception e) {
                    logger.info("Exception occured");
                }
            }
            logger.info("Resultant answer of power operations is : " + result);
            return result;
    }
    public static double log(double a){
            double c=0;
            logger.info("Calculating natural log  of given number:" + a);
            if(a<=0)
                c=-1;
            else
            c = Math.log(a);
            logger.info("Resultant answer of natural log operation is : " + c);
            return c;
    }
    public static double pow ( double a, double b){
            double c=0;
            logger.info("Calculating power function of given numbers:" + a+","+b);
            if (a == 0)
                return 0;
            if (b == 0)
                return 1;
            try {
                c = Math.pow(a, b);
            }
            catch(Exception e) {
                logger.info("Exception occured");
            }
            logger.info("Resultant answer of power operation is : " + c);
            return c;
        }
    }

