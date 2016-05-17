

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter your name");
        String userInput = inputName.nextLine();

        System.out.println(userInput);
        Interface.displayBoard();
    }


}