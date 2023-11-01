import java.util.Scanner;
public class ThrowEx3
{
    public static void method1(int a[]){
        for(int i=0;i<=a.length;i++)
        {
          	System.out.println(a[i]);  
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
		System.out.println("enter size");
		int n=sc.nextInt();
		int a[]=new int[n];
		try{
		    method1(a);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		    	System.out.println("index out of bound");
		}
	}
}