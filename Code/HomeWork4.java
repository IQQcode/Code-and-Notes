import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println("Kilograms    Pounds    |      Pounds       Kilograms");
        for(int i = 1; i < 200; i+=2) {
            double j =  i * 2.2;
            System.out.println(i + "            " + (double)(Math.round( j * 10))/10 + "   |");
        }
        for(int i  = 20; i <= 515; i+=5) {
            double j = i * (9.09 / 20);
            System.out.println("                         " + i + "             " + 
            (double)(Math.round( j * 100))/100);
        }
    }
}



public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println("可以被5整除的数为： ");
        for(int i = 100;i <= 200;i++) {
            if(i % 5 == 0 && i % 6 !=0 ) {
                System.out.print( i + "、");
            }
        }
        System.out.println( "可以被6整除的数为： ");
        for(int i = 100;i<=200;i++) {
            if(i % 5 != 0 && i % 6 == 0) {
                System.out.print( i + "、");
            }
        }
    }
}

