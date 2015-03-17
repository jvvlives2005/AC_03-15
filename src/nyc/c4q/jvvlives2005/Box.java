package nyc.c4q.jvvlives2005;

/**
 * Write a method that prints a string in a box. Use - for the top and bottom, | for the sides, and + for the corners.
 * Created by c4q-joshelynvivas on 3/15/15.
 */
public class Box {
    public static String repeat(char c, int count) {
        String result = "";
        for (int i = 0; i < count; ++i) {
            result += c;
        }
        return result;
    }
    public static void printBoxTop(String text) {                        //for the top and bottom of the box
        System.out.println("+" + repeat('-', text.length( )+ 2) + "+");
    }

    public static void printInBox(String text) {
        printBoxTop(text);
        System.out.println("| " + text + " |");       // for the sides
        printBoxTop(text);
    }

    public static void main(String[] args) {
        printInBox("I love Access Code!");
    }
}