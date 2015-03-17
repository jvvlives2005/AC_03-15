package nyc.c4q.jvvlives2005;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Created by c4q-joshelynvivas on 3/15/15.
 */
public class PrintTriangle {
    public static String substring(String text, int start, int end) {        //substring
        String result = "   ";
        return result;
    }

    public static String substring(String text, int start) {
        return substring(text, start, text.length());
    }


    public static void main(String[] args) {
        printTriangle("Hello, World!");

        /*String text = "Hello!";
        System.out.println(text.substring(0, 1));
        System.out.println(text.substring(0, 3));
        System.out.println(text.substring(0, 4));
        System.out.println(text.substring(0, 5));
        System.out.println(text.substring(0, 6));

        System.out.println("");

        String triangle = "Hello!";
        System.out.println(text.substring(0));
        System.out.println(" " + text.substring(1, 6));
        System.out.println("  " + text.substring(2, 6));
        System.out.println("   " + text.substring(3, 6));
        System.out.println("    " + text.substring(4, 6));
        System.out.println("     " + text.substring(5, 6));*/
    }



    //Answer:
    public static void printTriangle(String text) {
        for (int i = 1; i <= text.length(); i++){
            System.out.println(text.substring(0,i));
        }
    }

    public static void printUpperTriangle(String text){
        int len = text.length();
        for (int i = 0 ; i < text.length(); i++ ){
        }
    }
}