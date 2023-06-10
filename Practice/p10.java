import java.io.*;

public class c08{

//      public static void setOut(java.io.printStream){

        public static void main(String[] args)throws Exception{

                PrintStream ou = new PrintStream("mistry");

                System.out.println("adi");

                ou.println("adi");

                System.out.println(ou);

                System.setOut(ou.println("adi"));

                ou.println("adi");

        }
}
