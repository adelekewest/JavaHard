import java.util.Scanner;

public class WeaselOrNot {
    public static void main ( String[] args ) {
        String word;
        boolean yep, nope;

        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type the word \"weasel\", please." );
        word = keyboard.next();

        yep = word.equals("weasel");
        nope = !word.equals("weasel");

        System.out.println( "You typed what was requested: " + yep );
        System.out.println( "You ignored polite instrunctions: " + nope );
    }
}