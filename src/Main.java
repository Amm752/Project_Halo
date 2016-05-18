public class Main
{

    public static void main(String[] args)
    {
        String [][] grid = new String[11][11];
        Interface.makegrid(grid);
        Interface.displayBoard(grid);
        Models.supportpoke(grid);
        Interface.displayBoard(grid);
    }


}