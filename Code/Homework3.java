import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char num = (char)(Math.random() * 26 + 65);
        System.out.println("随机字母为：" + "******" + num + "*******");
       
        System.out.print("Please enter the side : ");
        double side = input.nextDouble();
        areaCount(side);
        
    }

    public static double areaCount(double s) {
        double Area = (6 * s * s)/(4 * Math.tan(Math.PI/6) );
        System.out.print("The area of the hexagon is :  " + Area);
        return Area;
    }
}