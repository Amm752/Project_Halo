import java.util.Scanner;

/**
 * Created by ahmad on 5/15/2016.
 */

public class Interface {
    //initlize the  board with places of postion
    static String A1, A2, A3, A4, A5, A6, A7, A8, A9, A10,
                  B1, B2, B3, B4, B5, B6, B7, B8, B9, B10,
                  C1, C2, C3, C4, C5, C6, C7, C8, C9, C10,
                  D1, D2, D3, D4, D5, D6, D7, D8, D9, D10,
                  E1, E2, E3, E4, E5, E6, E7, E8, E9, E10,
                  F1, F2, F3, F4, F5, F6, F7, F8, F9, F10,
                  H1, H2, H3, H4, H5, H6, H7, H8, H9, H10,
                  I1, I2, I3, I4, I5, I6, I7, I8, I9, I10,
                  G1, G2, G3, G4, G5, G6, G7, G8, G9, G10,
                  J1, J2, J3, J4, J5, J6, J7, J8, J9, J10;

    public static void userMove(String[] args) {
        System.out.println("Hello, Player");
        System.out.println();
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userInput = inputName.nextLine();

        System.out.println("Welcome: " + userInput);
    }

    public static void chosinglist(String[] args) {

    }


    public static void displayBoard() {
        String line = "";
        System.out.println();
        line = "0| " + " 1|  "+" 2|  "+ " 3|  "  + " 4| " + " 5|  " + " 6|  " + " 7|  "  + " 8|  " + "9|  " + " 10|  ";
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "A| " + getNH(A1)+" | " + getNH(A2) + " | " + getNH(A3) + " | " + getNH(A4)+ " | " +getNH(A5) + " | " + getNH(A6)+ " | " + getNH(A7) + " | " + getNH(A8) + " | " + getNH(A9) + " | " + getNH(A10);
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "B| " + getNH(B1)+" | " + getNH(B2) + " | " + getNH(B3) + " | " + getNH(B4)+ " | " +getNH(B5) + " | " + getNH(B6)+ " | " + getNH(B7) + " | " + getNH(B8) + " | " + getNH(B9) + " | " + getNH(B10);
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "C| " + getNH(C1)+" | " + getNH(C2) + " | " + getNH(C3) + " | " + getNH(C4)+ " | " +getNH(C5) + " | " + getNH(C6)+ " | " + getNH(C7) + " | " + getNH(C8) + " | " + getNH(C9) + " | " + getNH(C10);
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "D| " + getNH(D1)+" | " + getNH(D2) + " | " + getNH(D3) + " | " + getNH(D4)+ " | " +getNH(D5) + " | " + getNH(D6)+ " | " + getNH(D7) + " | " + getNH(D8) + " | " + getNH(D9) + " | " + getNH(D10);
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "E| " + getNH(E1)+" | " + getNH(E2) + " | " + getNH(E3) + " | " + getNH(E4)+ " | " +getNH(E5) + " | " + getNH(E6)+ " | " + getNH(E7) + " | " + getNH(E8) + " | " + getNH(E9) + " | " + getNH(E10);
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "F| " + getNH(F1)+" | " + getNH(F2) + " | " + getNH(F3) + " | " + getNH(F4)+ " | " +getNH(F5) + " | " + getNH(F6)+ " | " + getNH(F7) + " | " + getNH(F8) + " | " + getNH(F9) + " | " + getNH(F10);
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "G| "+ getNH(G1)+" | " + getNH(G2) + " | " + getNH(G3) + " | " + getNH(G4)+ " | " +getNH(G5) + " | " + getNH(G6)+ " | " + getNH(G7) + " | " + getNH(G8) + " | " + getNH(G9) + " | " + getNH(H10);
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "H| "+ getNH(H1)+" | " + getNH(H2) + " | " + getNH(H3) + " | " + getNH(H4)+ " | " +getNH(H5) + " | " + getNH(H6)+ " | " + getNH(H7) + " | " + getNH(H8) + " | " + getNH(H9) + " | " + getNH(I10);
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "I| " + getNH(I1)+" | " + getNH(I2) + " | " + getNH(I3) + " | " + getNH(I4)+ " | " +getNH(I5) + " | " + getNH(I6)+ " | " + getNH(I7) + " | " + getNH(I8) + " | " + getNH(I9) + " | " + getNH(G10);
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "J| " + getNH(J1)+" | " + getNH(J2) + " | " + getNH(J3) + " | " + getNH(J4)+ " | " +getNH(J5) + " | " + getNH(J6)+ " | " + getNH(J7) + " | " + getNH(J8) + " | " + getNH(J9) + " | " + getNH(J10);
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
    }

    public static String getNH(String square) {
        return null;
    }





        /**
        init board with places of postion
        static int A1, A2, A3, B1, B2, B3, C1, C2, C3, D1, D2, D3, E1, E2, E3, F1, F2, F3, H1, H2, H3, I1, I2, I3, J1, J2, J3;
        String Playerone = "";
        String Playertwo = "";
        boolean gameIsWon = false;





        public static void displayBoard()
        {
            String line = "";
            System.out.println();
            line = " "  + " | " +   " | " +  " | " +  " | " ;
            System.out.println(line);
            System.out.println("-------------------------------");
            line = " "  + " | " + " | " + " | "  + " | " ;
            System.out.println(line);
            System.out.println("-------------------------------");


            /*line = " " + getNH(C1) + " | " + getNH(C2) + " | " + getNH(C3) + " | " + getNH(C4) + " | " + getNH(C5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + getNH(D1) + " | " + getNH(D2) + " | " + getNH(D3) + " | " + getNH(D4) + " | " + getNH(D5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + getNH(E1) + " | " + getNH(E2) + " | " + getNH(E3) + " | " + getNH(E4) + " | " + getNH(E5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + getNH(F1) + " | " + getNH(F2) + " | " + getNH(F3) + " | " + getNH(F4) + " | " + getNH(F5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + getNH(G1) + " | " + getNH(G2) + " | " + getNH(G3) + " | " + getNH(G4) + " | " + getNH(G5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + getNH(H1) + " | " + getNH(H2) + " | " + getNH(H3) + " | " + getNH(H4) + " | " + getNH(H5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + getNH(I1) + " | " + getNH(I2) + " | " + getNH(I3) + " | " + getNH(I4) + " | " + getNH(I5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + getNH(J1) + " | " + getNH(J2) + " | " + getNH(J3) + " | " + getNH(J4) + " | " + getNH(J5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println(); */


}




