
import java.util.*;
import java.io.*;
import com.google.common.math.BigIntegerMath;

public class Calculator {
    static double a,b,c;
    static int choice;
    static boolean check=true;
    static Scanner sc=new Scanner(System.in);

    public static void main (String args[]) throws IOException{

        while(check){
            try{
                System.out.println("Press 1:Square Root,\t 2:Factorial,\t 3:Natural Logarithm,\t 4:Power Funtion,\t 5:Exit");
                System.out.print("Enter your choice:");
                choice=sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.print("Enter a number for calculating square-root::");
                        a= sc.nextDouble();
                        c=sqrt(a);
                        if(c<0)
                            System.out.println("Square root of negative number can not be calculated");
                        else
                            System.out.println("The resultant output is: "+c);
                        break;
                    case 3: System.out.print("Enter a number for calculating natural-logarithm::");
                        double a= sc.nextDouble();
                        c=log(a);
                        if(c<0)
                             System.out.println("Input number can not be less than or equal to zero for finding log");
                        else
                             System.out.println("The resultant output is: "+ c);
                        break;
                    case 4:
                        System.out.print("Enter two numbers separated by space for calculating power(a^b: a b)::");
                        a= sc.nextDouble();
                        b= sc.nextDouble();
                        c=pow(a,b);
                        System.out.println("The resultant output is: "+ c);
                        break;
                    case 2:
                        System.out.print("Enter a number for calculating factorial::");
                        int f=sc.nextInt();
                        long fac= fact(f);
                        if(fac<0)
                            System.out.println("Factorial of negative number can not be calculated");
                        else
                            System.out.println("Answer is: "+ fac);
                        break;
                    case 5:
                        System.out.println("Thank you for using calculator;Have a nice day!!!!");
                        check=false;
                        break;
                    default:
                        System.out.println("X Wrong choice entered,please enter a valid number X");
                }
            }
            catch (Exception inp){
                System.out.println("Error: "+inp );
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
