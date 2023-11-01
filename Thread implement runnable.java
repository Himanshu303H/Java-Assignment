
public class Main2 implements Runnable{
    public static void main(String[]args){
        Main obj =new Main();
        Thread thread=new Thread(obj);
    thread.start();
System.out.println("This code is outside of the thread");
}
        public void run(){
            System.out.println("This cod eis running in a thread");
        }
    }