public class Main4 implements Runnable 
{
  public static void main (String[]args)
  {
    Main obj1 = new Main ();
    Thread t1=new Thread(obj1);
      t1.start ();
    Main obj2 = new Main ();
    Thread t2 =new Thread(obj2);
     t2.start();


      System.out.println ("This code is outside of the thread");
  }
  public void run ()
  {
    System.out.println ("This cod eis running in a thread");
  }
}