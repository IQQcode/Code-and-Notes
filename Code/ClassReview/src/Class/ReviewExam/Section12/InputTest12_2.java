package Class.ReviewExam.Section12;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputTest12_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean success = true;
        do {
            try {
                System.out.print("请输入两个整数： ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println("\nsum = " + (num1 + num2));
            }
            catch(InputMismatchException e) {
                System.err.println("Input is error！Please try again...");
                input.nextLine();
            }
        }while (success);
    }
}
