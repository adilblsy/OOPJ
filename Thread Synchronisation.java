class display {
   public synchronized void print(String msg) {
      System.out.print("["+msg);
      try {
         Thread.sleep(100);
      } catch(InterruptedException e) {
           System.out.println(e.getMessage());
      }
      System.out.println("]");
   }
}

class Sync extends Thread {
   display d;
   String msg;

   public Sync(display d, String msg) {
      this.msg = msg;
      this.d = d;
   }
   public void run() {
      d.print(msg);
   }
}


class TSync {
   public static void main(String [] args) {
      display d = new display();
      Sync s1 = new Sync(d, "hi");
      Sync s2 = new Sync(d, "man");

      s1.start();
      s2.start();
   }
}