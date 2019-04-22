import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //产生随机数
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);
        //保证 num1始终大于num2
        if(num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print( num1 + "-" + num2 + "是多少?    ");
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        if(num1 - num2 == result) {
            System.out.println("恭喜你，算对了！");
        }else {
            System.out.print("你是飘了，在好好想想……");
            System.out.println("正确结果是：" + (num1 - num2));
        }
    }
}


public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个三位数：");
        int number = input.nextInt();
        if(isHuiwenNumber(number)) {
            System.out.print(number + "是回文数");
        }else {
            System.out.print(number + "不是回文数");
        }
    }

    public  static  boolean isHuiwenNumber(int num) {
        if(num > 99 && num < 1000) {
            /**
             * 取到每一位比较
             */
            // int hundred = num / 100;  //取到百位
            // int decade = (num / 10) % 10;
            // int unit = num % 10;     //取到个位
            // int temp = unit * 100 + decade * 10 + hundred;

            /**
             * 个位和百位比较
             */
             int hundred = num / 100;  //取到百位
             int unit = num % 10;     //取到个位
            //if(temp == num)
            if(hundred == unit) {   //if(temp == num)
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}