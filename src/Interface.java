import java.util.Scanner;

/**
 * Created by ahmad on 5/15/2016.
 */

public  class Interface
{
    //initlize the  board with places of postion
    String [][] grid = new String[10][10];



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
        grid[1][1]= Poke_database.name("001");
        System.out.println("");
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
            return null;
    }
}




