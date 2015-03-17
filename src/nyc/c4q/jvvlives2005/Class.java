package nyc.c4q.jvvlives2005;

/** Alex Teaching
 * Created by c4q-joshelynvivas on 3/15/15.
 */
public class Class {
    public static void main(String[] args){
        char fromLetter = 'e';
        char toLetter = 'o';
        System.out.println(
                "pineapple in your basement".replace(fromLetter,toLetter));

        String mesq = "pineapple in your basement";
        String newMesq = mesq.replace(fromLetter, toLetter);
        System.out.println(mesq);
        System.out.println(newMesq);

        String s = String.valueOf(42);
        //is the same as
        String t = "42";



    }
}
