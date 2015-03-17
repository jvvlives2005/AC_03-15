package nyc.c4q.jvvlives2005;

/**
 * Exercise: Write a method pad(string, length, padChar) that returns string padded on the right with padChar.
 * For example, pad("Hello.", 10, '-') returns "Hello.----".
 * Created by c4q-joshelynvivas on 3/15/15.
 */
public class Padding {

    public static String repeat(char c, int count) {
        String result = "";
        for (int i = 0; i < count; ++i) {
            result += c;
        }
        return result;
    }

    public static String pad(String text, int length, char padChar){
        /*while (text-length() < length){
            text += padChar;
        }*/
        return text + repeat(padChar, length - text.length());
    }

    public static void main (String[] args){
        System.out.println(pad("Hello.",10,'-'));
    }

}


