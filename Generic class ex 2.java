/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//generic class
class MyData{
    Integer i;
    public void set(Integer i1){
        i=i1;
    }
    public Integer get(){
        return (i);
    }
}
public class Example{
    public static void main(String[] args){
        MyData m1 = new MyData();
        Integer i1 = 3;
        m1.set(i1);
       System.out.println( m1.get());
    }
}