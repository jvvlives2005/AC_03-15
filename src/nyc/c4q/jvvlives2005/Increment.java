package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/15/15.
 */
public class Increment {
    public static void main(String[] args) {
        int i = 17;
        System.out.println(i);

        int x = i++;    //post increment
        System.out.println(i);
        System.out.println("x = " + x);

        int y = ++i;   //pre increment
        System.out.println(i);
        System.out.println("y = " + y);

    }
}
