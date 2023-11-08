/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//generic class example
class MyData <E>{
    E i;
    public void set(E i1){
        i=i1;
    }
    public E get(){
        return (i);
    }
}
public class Example{
    public static void main(String[] args){
        MyData<Integer> m1 = new MyData<Integer>();
        MyData<String> m2 = new MyData<String>();
        String s = "Heyy";
        m2.set(s);
        System.out.println(m2.get());
        Integer i1 = 3;
        m1.set(i1);
        System.out.println(m1.get());
    }
}