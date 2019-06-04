package Class.ReviewExam.Section4;
import java.util.Scanner;


public class RandomLetter4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char num = (char)(Math.random() * 26 + 65);
        System.out.println("随机字母为： " + num);
    }
}

