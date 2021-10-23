package Lesson5;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateCsv
{
    public static void main(String [] args)
    {
        generateCsvFile("test.csv");
    }

    private static void generateCsvFile(String sFileName)
    {
        try
        {
            FileWriter writer = new FileWriter(sFileName);

            writer.append("Id");
            writer.append(';');
            writer.append("Name");
            writer.append(';');
            writer.append("Role");
            writer.append(';');
            writer.append("Salary");

            writer.append('\n');

            writer.append("1");
            writer.append(';');
            writer.append("Ivan");
            writer.append(';');
            writer.append("director");
            writer.append(';');
            writer.append("123");
            writer.append('\n');

            writer.append("2");
            writer.append(';');
            writer.append("Oleg");
            writer.append(';');
            writer.append("manager");
            writer.append(';');
            writer.append("135");
            writer.append('\n');

            writer.append("3");
            writer.append(';');
            writer.append("Egor");
            writer.append(';');
            writer.append("boss");
            writer.append(';');
            writer.append("1234567");
            writer.append('\n');




            writer.flush();
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}


