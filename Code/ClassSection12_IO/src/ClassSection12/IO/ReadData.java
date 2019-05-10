package ClassSection12.IO;

import java.io.*;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception {
        File file = new File("source.txt");
        Scanner input = new Scanner(file);
        /**
         * sc.hasNext() 表示你是否有输入数据，
         * while语句块 表示当你输入数据的时候，就执行输出sc.next()（输出内容）
         * 所以只要你输入数据了，它就可以执行，
         * 所以后台只是开了一块内存，一直未关闭，不算死循环
         */
        while(input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int salary = input.nextInt();
            System.out.println(firstName + " " + mi + lastName + " " + salary);
        }
        //Close the file
        input.close();
    }
}
