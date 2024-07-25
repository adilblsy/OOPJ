import java.util.Scanner;

class Exception {

   public static void divide(float a, float b) throws ArithmeticException {
      if(b==0) {
         throw new ArithmeticException("Cannot Divide By Zero");
      }
      else {
         System.out.println("Result: "+a/b);
      }
   }

   public static void main(String [] args) {
      try {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter two numbers: ");
         float x = sc.nextInt();
         sc.nextLine();
         float y = sc.nextInt();
         sc.nextLine();
         divide(x, y);
      } catch(ArithmeticException e) {
           System.out.println(e.getMessage());
      }

      finally {
         System.out.println("Code Executed");
      }
   }
}