import java.util.Scanner;

/**
 * Created by ahmad on 5/15/2016.
 */
public class Models {
    // Grap the id, hp, type, from the database
    //int[] id =
    // Function for postion

    // Function for Defet   ing a poke
        // else Freez

    // Function for Support Poke
    public static void supportpoke(String grid[][]){
        // initlize the input points
        int points;
        int x = 0;
        int y = 0;
        // scanners to grap the first hidden pokemon
        Scanner support1 = new Scanner(System.in);
        System.out.println("What is your First Pokemon supporter:");
        String Hpoke1 = support1.nextLine();
        // Enter the coordinates
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your x-coordinate " + x + " and your y-coordinate. "+ y);
        // saving the X,Y
        points = scan.nextInt();
        int[][] coords = new int[points][points];
            coords[x][y] = scan.nextInt();
        // Showing the grid
        grid[points][points] = Poke_database.name(Hpoke1);


        Scanner support2 = new Scanner(System.in);
        System.out.println("What is your Second Pokemon supporter:");
        String Hpoke2 = support1.nextLine();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter your x-coordinate " + x + " and your y-coordinate. "+ y);

        points = scan2.nextInt();
        int[][] coords2 = new int[points][points];
        coords2[x][y] = scan.nextInt();
        grid[points][points] = Poke_database.name(Hpoke2);
    }


    // check if the move is vaild
    //public static void moveVaild(){

    //}

}
