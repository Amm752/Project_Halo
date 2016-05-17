/**
 * Created by eevee on 5/15/2016.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Poke_database {
    public static void readfile() {
        String fileName = "poke_data_base2.txt";
        String line = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] words = line.split(" ");
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }


   public static String name(String x)
   {
        String fileName = "poke_data_base2.txt";
        String line = null;
        try
        {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((line = bufferedReader.readLine()) != null)
                {
                    String[] words = line.split(" ");

                    if (words[0].equals(x))
                    {
                        String name = words[1].substring(1);

                        return name;
                    }
                }
                bufferedReader.close();
            }
        catch (FileNotFoundException ex)
        {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch (IOException ex)
        {
            System.out.println("Error reading file '" + fileName + "'");
        }

       System.out.println("not found");
       return null;
    }

    public static int hp(String x)
    {
        String fileName = "poke_data_base2.txt";
        String line = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null)
            {

                String[] words = line.split(" ");

                if (words[0].equals(x))
                {
                    String hp_string = words[2].substring(6);
                    float hp_float = (Float.valueOf(hp_string)).floatValue();
                    int hp_int = (int)hp_float;
                    return hp_int;
                }
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch (IOException ex)
        {
            System.out.println("Error reading file '" + fileName + "'");
        }
        System.out.println("not found");
        return 0;
    }
}