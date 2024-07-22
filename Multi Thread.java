import java.util.Random;

class RandomThread extends Thread {
   public void run() {

      Random r = new Random();
      int i;

      for(i=0; i<=20; i++) {
         int n = r.nextInt(100);

         if(n % 2 == 0) {
            new even(n).start();
         }
         else {
            new odd(n).start();
         }
      }
   }
}

class even extends Thread {
   int num;
   public even(int num) {
      this.num = num;
   }
   public void run() {
      System.out.println("Square Of "+num+" is: "+num*num);
   }
}

class odd extends Thread {
   int num;
   public odd(int num) {
      this.num = num;
   }
   public void run() {
      System.out.println("Cube Of "+num+" is: "+num*num*num);
   }
}

class MThread {
   public static void main(String [] args) {
      RandomThread rt = new RandomThread();
      rt.start();
   }
}