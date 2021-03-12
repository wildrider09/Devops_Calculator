
import java.math.BigInteger;
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
                System.out.println("Press 1:Square Root, 2:Factorial, 3:Natural Logarithm, 4:Power Funtion, 5:Exit");
                System.out.print("Enter your choice:");
                choice=sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.print("Enter a positive number:");
                        a= sc.nextDouble();
                        c=sqrt(a);
                        if(c<0)
                            System.out.println("Number can not be negetive");
                        else
                            System.out.println("Answer is: "+c);
                        break;
                    case 3: System.out.print("Enter a number greater than 0:");
                        double a= sc.nextDouble();
                        c=log(a);
                        if(c<0)
                             System.out.println("Number can not be less than or equal to zero");
                        else
                             System.out.println("Answer is: "+ c);
                        break;
                    case 4:
                        System.out.print("Enter two numbers with space (a^b: a b):");
                        a= sc.nextDouble();
                        b= sc.nextDouble();
                        c=pow(a,b);
                        System.out.println("Answer is: "+ c);
                        break;
                    case 2:
                        System.out.print("Enter a positive number:");
                        int f=sc.nextInt();
                        BigInteger fac= fact(f);
                        int test= fac.compareTo(new BigInteger("0"));
                        if(test<0)
                            System.out.println("Number can not be negetive");
                        else
                            System.out.println("Answer is: "+ fac);
                        break;
                    case 5:
                        System.out.println("Thank you for using Calculator");
                        check=false;
                        break;
                    default:
                        System.out.println("Wrong Choice,enter a valid number");
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
    public static BigInteger fact(int f){
        if(f<0){
            return new BigInteger("-1");
        }
        BigInteger ans = BigIntegerMath.factorial(f);
        return ans;
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