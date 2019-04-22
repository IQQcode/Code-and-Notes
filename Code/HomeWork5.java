
import java.util.Scanner;

//求每位数字之和
public class HomeWork5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        Long number = input.nextLong();
        sumDidits(number);
    }

    public static void sumDidits(Long num) {
        Long unit = num % 10L;
        Long decade = (num / 10L) % 10L;
        Long hundred = num / 100L;
        Long sum = unit + decade + hundred;
        System.out.print("每个位数字之和为： " + sum);
    }
}

//求 10000以内的素数
public class HomeWork5 {
    public static void main(String[] args) {
        for (int i = 2; i <=10000; i++) {
        isPrime(i);     
        }
    }

    public static void isPrime(int i) {
        boolean flag=true;
        for (int j = 2; j < Math.pow(i, 0.5)+1; j++) {
            if (i % j==0) {
                flag = false;
            }
        }
        //每10个素数切换一行
        int count = 0;
        if (flag) {
            if (count % 10 == 0) {
            System.out.print(i+"、 ");
            }
            count++;
        }
    }
}



