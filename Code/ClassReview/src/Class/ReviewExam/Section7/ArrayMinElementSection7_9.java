package Class.ReviewExam.Section7;
import java.util.Scanner;

public class ArrayMinElementSection7_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入10个数(找出最小值)： ");
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }
        System.out.println(min(arr));
    }

    public static double min(double[] array) {
        double temp = 0;
        for(int i = 0; i < array.length; i++) {
            temp = array [0];
            if (array [i] < temp) {
                temp = array [i];
            }
        }
        return temp;
    }
}
