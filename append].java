import java.io.*;
class Main4{
        public static void main(String args[])

        {
        try {
                File file = new File("a.txt");
                FileWriter fr = new FileWriter(file, true);
                fr.write("************data***********");
                fr.close();
            }catch(Exception e){
                e.getStackTrace();
            }
        }
}