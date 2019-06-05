package Class.ReviewExam.Section12;

import java.util.*;
import java.io.*;

public class ReadNumber12_15 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Exercisel2_15.txt");
        PrintWriter msg = null;
        if(!file.exists()) {
             msg = new PrintWriter(file);
        }
        Random random = new Random(10);
        for(int i = 0; i < 100; i++) {
            msg.print(random.nextInt(100) + " ");
        }
        msg.close();
    }
}
