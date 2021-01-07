import java.util.InputMismatchException;
import java.util.Scanner;
public class Expt_13
{
   public static void main(String args[])
   {
      Scanner sc= new Scanner(System.in);
      try{
         System.out.print("enter numberator");
         int num1= sc.nextInt();
         System.out.print("enter denominator");
         int num2= sc.nextInt();
         int output=num1/num2;
         System.out.println ("Result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }
      catch(InputMismatchException r){
         System.out.println("you must enter integers only please try again");
      }
   }
}
