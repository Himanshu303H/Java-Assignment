import java.util.Scanner;
class Table extends Thread{
    public static void main(String[] args){
        Table thread1 = new Table();
        Table thread2 = new Table();
        thread1.start();
        thread2.start();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}