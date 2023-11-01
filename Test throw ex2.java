/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class TestThrow {
    public static void checkNum(String s){
        if(s==null){
        throw new ArithmeticException("\n Number is negative, cannot calculaye square");
        
    }
    else {
        //System.out.println("square of"+s+"is"+(num*num));
    }
}
public static void main(String[] args){
    TestThrow obj = new TestThrow();
    obj.checkNum(null);
    System.out.println("rest of the code");
}
}