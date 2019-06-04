package Class.ReviewExam.Section3;
import java.util.Scanner;

public class Lottery3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int LotteryDigit = (int)(Math.random()*100);
        System.out.print("请输入要猜的数： ");
        int guess = input.nextInt();
        int Lottery1 = LotteryDigit / 10;
        int Lottery2 = LotteryDigit % 10;
        int guessNumber1 = guess / 10;
        int guessNumber2 = guess % 10;
        if(guess == LotteryDigit) {
            System.out .println("Exact match: you win $10,000") ;
        }else if(Lottery1==guessNumber2 && Lottery2==guessNumber1) {
            System.out .println("Match all digits: you win $3,000");
        }else if(guessNumber1==Lottery1 || guessNumber1==Lottery2||
                 guessNumber2==Lottery1 || guessNumber2==Lottery2) {
            System.out .println("Hatch one digit: you win $1,000");
        }else {
            System.out .println("Sorry, no match");
        }
    }
}
