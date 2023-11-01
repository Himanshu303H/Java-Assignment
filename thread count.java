//thread in comnstructor 
class ThreadCount extends Thread{
    ThreadCount(String s){
        super(s);
        System.out.println("new thread created"+this);
        start();
    
    }
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("new thread created"+this);
                Thread.sleep(1500);
            }
        }
        catch(Exception e){
            System.out.println("Currently exceuting thread run is Exception");
        }
         System.out.println("Currently exceuting thread run is terminated");
    }
    public static void main(String[]args){
            ThreadCount t1=new ThreadCount("T1");
            ThreadCount t2=new ThreadCount("T2");
            
}
}