package Class.ReviewExam;
import java.util.Scanner;

//求每位数字之和
/*
public class Section6Topic2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        Long number = input.nextLong();
        System.out.print("每个位数字之和为： " + sumDidits(number));
    }

    public static Long sumDidits(Long num) {
        Long unit = num % 10L;
        Long decade = (num / 10L) % 10L;
        Long hundred = num / 100L;
        Long sum = unit + decade + hundred;
        return sum;
    }
}
*/



//求10000内的素数
public class Section6Topic2_10 {
    public static void main(String[] args) {
        for (int i = 2; i <=10000; i++) {
            isPrime(i);
        }
    }

    public static void isPrime(int i) {
        boolean flag = true;
        for (int j = 2; j < Math.pow(i, 0.5) + 1; j++) {
            if (i % j==0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print(i+"、 ");
        }
    }
}
