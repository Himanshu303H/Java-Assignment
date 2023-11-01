/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main extends Thread
{
    public static void main(String[]args)
    {
        Main Thread = new Main();
        Thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run()

    {
        System.out.println("This code is  running in a thread");
    }
}
