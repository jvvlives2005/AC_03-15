package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/15/15.
 */
public class HelloWorld {

    public static String reverse(String input) {
        String reverse= "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i); // or reverse += input.charAt(i)
        }

        return reverse;
    }

    public static void printReverse(String input) {               //the other way
        System.out.println(reverse(input));
       /* String reverse= "";

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
            reverse = reverse + input.charAt(i);
        }
        */
    }
    public static void main(String[] args){
       // printReverse("Hello, World!");


        //reverse("Hello");
        System.out.println(reverse("Hello"));

    }


    /*public static void printReverse(String text) {      //one way--not ideal
        for(int i = text.length() - 1; i >= 0; i--) {
        }
        System.out.print(text.charAt(12));
        System.out.print(text.charAt(11));
        System.out.print(text.charAt(10));
        System.out.print(text.charAt(9));
        System.out.print(text.charAt(8));
        System.out.print(text.charAt(7));
        System.out.print(text.charAt(6));
        System.out.print(text.charAt(5));
        System.out.print(text.charAt(4));
        System.out.print(text.charAt(3));
        System.out.print(text.charAt(2));
        System.out.print(text.charAt(1));
        System.out.print(text.charAt(0));
    }*/


}
