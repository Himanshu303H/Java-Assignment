public class TestThrows {
    public static intdivideNum(int m,int n)throws ArithmeticException{
        int div =m/n;
        return div;
        
    }
    public static void main(String[]args){
        TestThrows obj =new TestThrows();
        try{
            System.out.println(obj.divideNum(45,0));
        }catch(ArithmeticException e){ 
            System.out.println("\n Number cannot be divided by 0");
            
        }
        System.out.orintln("rest of the code..");
    }
}