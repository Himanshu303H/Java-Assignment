
public class Main3 extends Thread
{
  public static void main (String[]args)
  {
    Main thread1 = new Main ();
      thread1.start ();
    Main thread2 = new Main ();
     thread2.start();


      System.out.println ("This code is outside of the thread");
  }
  public void run ()
  {
    System.out.println ("This cod eis running in a thread");
  }
}