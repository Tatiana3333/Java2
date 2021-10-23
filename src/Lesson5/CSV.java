package Lesson5;

import java.io.*;


public class CSV {
    public static void main(String[]args) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        sb.append("id");
        sb.append(';');
        sb.append("name");
        sb.append(';');
        sb.append("role");
        sb.append(';');
        sb.append("salary");
        sb.append('\n');

        sb.append("1");
        sb.append(';');
        sb.append("Oleg");
        sb.append(';');
        sb.append("director");
        sb.append(';');
        sb.append("123");
        sb.append('\n');

        sb.append("2");
        sb.append(';');
        sb.append("Ivan");
        sb.append(';');
        sb.append("director");
        sb.append(';');
        sb.append("321");
        sb.append('\n');

        pw.write(sb.toString());
        pw.close();
    }
}


