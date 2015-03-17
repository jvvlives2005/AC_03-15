package nyc.c4q.jvvlives2005;

/**
 * Exercise: Write a method repeat() that takes a character and a length, and returns a string consisting of that character repeated to produce a string of the given length.

 For example, repeat('x', 8) returns "xxxxxxxx".
 * Created by c4q-joshelynvivas on 3/15/15.
 */
public class repeat {
    public static void main(String[] args){
        System.out.println(repeat ('x',9));
    }

    public static String repeat(char letter, int number){
        String repeat = ("");
        for (int i = 0; i <=number; i++){
            repeat += letter;

        }
        return repeat;
    }
}
