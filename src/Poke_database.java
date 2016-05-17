/**
 * Created by eevee on 5/15/2016.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Poke_database
{
    public static void readfile()
    {
        String fileName = "poke_data_base2.txt";
        String line = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
                String [] words = line.split(" ");
               // System.out.println(words[0]);
               // System.out.println(words[1]);
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Unable to open file '" + fileName + "'");
        }

        catch(IOException ex)
        {
            System.out.println("Error reading file '" + fileName + "'");

        }
    }
    public String getHp(String x)
    {
        String fileName = "poke_data_base2.txt";
        String line = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
                String [] words = line.split(" ");
                if (words[0] == x)
                {
                    return words[5];
                }
                // System.out.println(words[1]);
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Unable to open file '" + fileName + "'");
        }

        catch(IOException ex)
        {
            System.out.println("Error reading file '" + fileName + "'");

        }
        return ;
    }

}
