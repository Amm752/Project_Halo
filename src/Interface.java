import java.util.Scanner;

/**
 * Created by ahmad on 5/15/2016.
 */

public  class Interface
{
    //initlize the  board with places of postion
    String [][] grid = new String[10][10];


//    static String A1, A2, A3, A4, A5, A6, A7, A8, A9, A10,
//                  B1, B2, B3, B4, B5, B6, B7, B8, B9, B10,
//                  C1, C2, C3, C4, C5, C6, C7, C8, C9, C10,
//                  D1, D2, D3, D4, D5, D6, D7, D8, D9, D10,
//                  E1, E2, E3, E4, E5, E6, E7, E8, E9, E10,
//                  F1, F2, F3, F4, F5, F6, F7, F8, F9, F10,
//                  H1, H2, H3, H4, H5, H6, H7, H8, H9, H10,
//                  I1, I2, I3, I4, I5, I6, I7, I8, I9, I10,
//                  G1, G2, G3, G4, G5, G6, G7, G8, G9, G10,
//                  J1, J2, J3, J4, J5, J6, J7, J8, J9, J10;

    public static void makegrid(String grid [][])
    {
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                grid[i][j] = null;
            }
        }
    }

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


    public static void displayBoard(String grid[][])
    {
        String line = "";
        grid[1][1]= Poke_database.name("130");
        System.out.println();
        line = "0| " + " 1|  "+" 2|  "+ " 3|  "  + " 4| " + " 5|  " + " 6|  " + " 7|  "  + " 8|  " + "9|  " + " 10|  ";
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "A| " + grid[1][1]+ " |" + grid[1][2]+" | " + grid[1][3] + " | " + grid[1][4] + " | " + grid[1][5]+ " | " +grid[1][6] + " | " + grid[1][7]+ " | " + grid[1][8] + " | " + grid[1][9] + " | " + grid[1][10];
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "B| " + grid[2][1]+ " |" + grid[2][2]+" | " + grid[2][3] + " | " + grid[2][4] + " | " + grid[2][5]+ " | " +grid[2][6] + " | " + grid[2][7]+ " | " + grid[2][8] + " | " + grid[2][9] + " | " + grid[2][10];
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "C| " + grid[3][1]+ " |" + grid[3][2]+" | " + grid[3][3] + " | " + grid[3][4] + " | " + grid[3][5]+ " | " +grid[3][6] + " | " + grid[3][7]+ " | " + grid[3][8] + " | " + grid[3][9] + " | " + grid[3][10];
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "D| " + grid[4][1]+ " |" + grid[4][2]+" | " + grid[4][3] + " | " + grid[4][4] + " | " + grid[4][5]+ " | " +grid[4][6] + " | " + grid[4][7]+ " | " + grid[4][8] + " | " + grid[4][9] + " | " + grid[4][10];
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "E| " + grid[5][1]+ " |" + grid[5][2]+" | " + grid[5][3] + " | " + grid[5][4] + " | " + grid[5][5]+ " | " +grid[5][6] + " | " + grid[5][7]+ " | " + grid[5][8] + " | " + grid[5][9] + " | " + grid[5][10];
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "F| " + grid[6][1]+ " |" + grid[6][2]+" | " + grid[6][3] + " | " + grid[6][4] + " | " + grid[6][5]+ " | " +grid[6][6] + " | " + grid[6][7]+ " | " + grid[6][8] + " | " + grid[6][9] + " | " + grid[6][10];
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "G| " + grid[7][1]+ " |" + grid[7][2]+" | " + grid[7][3] + " | " + grid[7][4] + " | " + grid[7][5]+ " | " +grid[7][6] + " | " + grid[7][7]+ " | " + grid[7][8] + " | " + grid[7][9] + " | " + grid[7][10];
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "H| " + grid[8][1]+ " |" + grid[8][2]+" | " + grid[8][3] + " | " + grid[8][4] + " | " + grid[8][5]+ " | " +grid[8][6] + " | " + grid[8][7]+ " | " + grid[8][8] + " | " + grid[8][9] + " | " + grid[8][10];
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "I| " + grid[9][1]+ " |" + grid[9][2]+" | " + grid[9][3] + " | " + grid[9][4] + " | " + grid[9][5]+ " | " +grid[9][6] + " | " + grid[9][7]+ " | " + grid[9][8] + " | " + grid[9][9] + " | " + grid[9][10];
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
        line = "J| " + grid[10][1]+ " |" + grid[10][2]+" | " + grid[10][3] + " | " + grid[10][4] + " | " + grid[10][5]+ " | " +grid[10][6] + " | " + grid[10][7]+ " | " + grid[10][8] + " | " + grid[10][9] + " | " + grid[10][10];
        System.out.println(line);
        System.out.println("------------------------------------------------------------------------");
    }

    public static String grid(String square)
    {
         //A1 = Poke_database.name("130");
            return null;
//          if ((id< 152) && (id > 0))
//        {
//            String id2 = String.valueOf(id);
//            return Poke_database.name(id2);
//       }
        //return Poke_database.name(id);
       // return null;
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


            /*line = " " + grid(C1) + " | " + grid(C2) + " | " + grid(C3) + " | " + grid(C4) + " | " + grid(C5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + grid(D1) + " | " + grid(D2) + " | " + grid(D3) + " | " + grid(D4) + " | " + grid(D5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + grid(E1) + " | " + grid(E2) + " | " + grid(E3) + " | " + grid(E4) + " | " + grid(E5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + grid(F1) + " | " + grid(F2) + " | " + grid(F3) + " | " + grid(F4) + " | " + grid(F5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + grid(G1) + " | " + grid(G2) + " | " + grid(G3) + " | " + grid(G4) + " | " + grid(G5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + grid(H1) + " | " + grid(H2) + " | " + grid(H3) + " | " + grid(H4) + " | " + grid(H5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + grid(I1) + " | " + grid(I2) + " | " + grid(I3) + " | " + grid(I4) + " | " + grid(I5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println();
            line = " " + grid(J1) + " | " + grid(J2) + " | " + grid(J3) + " | " + grid(J4) + " | " + grid(J5);
            System.out.println(line);
            System.out.println("-------------------------------");
            System.out.println(); */


}




