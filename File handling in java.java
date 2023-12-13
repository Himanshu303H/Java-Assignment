/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.File;
class Main{
    public static void main(String[]args){
        File file = new File("newfile.txt");
        try{
            boolean value = file.createNewFile();
            if(value){
                System. out.println("the new file is created");
            }
            else{
                System.out.println("The new file is already exits");
            }
        }
        catch(Exception e){
            e.getStackTrace();
            

        }
    }
}
