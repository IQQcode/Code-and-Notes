package Class.ReviewExam;
import java.util.Scanner;

public class ArrayElementAverageSection7_8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入10个数：");
        for(int i = 0 ;i < array.length;i++) {
            array[i] = input.nextInt();
        }
        average(array);
        System.out.println("\n平均值为：" + average(array) );
    }

    public static int average(int[] array) {
        System.out.println("\n该数组元素为： " );
        for(int a : array) {
            System.out.print(array[a] + "、");
        }
        int sum = 0;
        for(int j = 0;j < array.length; j++) {
            sum += array[j];
        }
        return (sum / array.length);
    }

    public static double average(double[] array) {
        System.out.print("\n该数组元素为： " );

        for(double b : array) {
            System.out.print(array[(int) b] + "、");
        }
        double sum = 0;
        for(int j = 0;j < array.length; j++) {
            sum += array[j];
        }
        return ((sum)/ array.length);
    }
}
