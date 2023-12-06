/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Main{
    public static void main(String[]args){
        CallingClass call = new CallingClass();
        
        call.<String>genericMethod("429 and 727225 are nelan's lucky numbers");
        
        call.<Integer>genericMethod(25);
    }
}
class CallingClass{
    public<T>void genericMethod(T data){
        System.out.println("Gneric Method:");
        System.out.println("Data Passed In : " +data);
    }
}