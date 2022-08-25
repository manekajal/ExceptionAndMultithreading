package Exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionHandling {
    /*An exception (or exceptional event) is a problem that arises during the execution of a program.*/

    /*The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.*/

    /*there are three types of exceptions namely:

        1) Checked Exception
        2)Unchecked Exception
        3)Error */

    public static void main(String[] args) {
//        /* ArithmeticException */
//        try{
//            //code that may raise exception
//            int data=100/0;
//        }
//        catch(ArithmeticException e){System.out.println(e);}
//        //rest code of the program
//        System.out.println("rest of the code...");
//    }

        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        }
        // providing the checked exception handler
        catch (FileNotFoundException e) {

            System.out.println(e);
        }
        System.out.println("File saved successfully");
    }
}
