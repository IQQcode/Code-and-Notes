package ClassSection12.IO;

import java.io.*;
import java.util.*;

public class ReplaceText {
    public static void main(String[] args) throws Exception{
        File file = new File("Source.txt");
        if(file.exists()) {
            System.out.println("File already exists!!!");
            System.exit(0);
        }
        try(PrintWriter output = new PrintWriter(file)) {
           //write formatted output to the file
            output.print("Zhangsan T Smith ");
            output.println(10000);
            output.print("Zhaosi K Jones ");
            output.println(4000);
            output.close();
        }
    }
}
