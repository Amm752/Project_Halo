import java.io.InputStream;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {

        // Prints "Hello, World" to the terminal window.
        //Interface.userMove(args);

        //Interface.displayBoard();
        //Poke_database.readfile();
        //System.out.println("Eneter a pokemon number:");
        //Scanner pokeNum = new Scanner(System.in);  // Reading from System.in
        //System.out.println("Enter a number: ");
        //String j = pokeNum.nextLine(); // Scans the next token of the input as an int.
        String j = "147";
        System.out.println(Poke_database.name(j));
        System.out.println(Poke_database.hp(j));

        //Interface.displayBoard();

    }
}