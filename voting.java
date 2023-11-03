/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


class A{
    static int bjp=0;
    static int congress=0;
    public void vote(String s){
        if(s=="bjp"){
            bjp++;
        }
        else if(s=="cong"){
            congress++;
        }
    }
    void show(){
        System.out.println("bjp vote "+bjp);
        System.out.println("congress vote "+congress);
    }
}
class B implements Runnable{
    A a=new A();
    public void run(){
        a.vote("bjp");
    }
}
class C implements Runnable{
    A a=new A();
    public void run(){
        a.vote("cong");
    }
}
class Ex3
{
	public static void main(String[] args) {
	    A a=new A();
		for(int i=0;i<10000;i++){
		Thread t1=new Thread(new B());
		t1.start();
		}
		for(int i=0;i<100;i++){
		Thread t2=new Thread(new C());
		t2.start();
		}
		a.show();
	}
}