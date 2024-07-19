import java.util.Scanner;
import java.util.StringTokenizer;

class Tokenizer {
   public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the limit: ");
      int n = sc.nextInt();
      sc.nextLine();

      System.out.print("Enter "+n+" numbers (seperated with spaces): ");
      String numbers = sc.nextLine();
      
      StringTokenizer st = new StringTokenizer(numbers, " ");

      int sum = 0;      

      while(st.hasMoreTokens()) {
         sum += Integer.parseInt(st.nextToken());
      }
      System.out.print("Sum: "+sum);
   }
}