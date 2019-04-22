import java.util.Scanner;

//2.2
public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder:");
        double radius  =input.nextDouble();
        int length = input.nextInt();
        double area = radius * radius * (Math.PI);
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The valume is " + volume);
    }
}

//2.3
public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet:");
        double foot = input.nextDouble();
        double feet = foot * 0.305;
        System.out.println(foot + " feet is " + feet + " meters");
    }
}

//2.7
public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes:");
        int minutes = input.nextInt();
        int days = minutes / 1440;
        //int remainingMinutes = minutes % 60;
        int years = days / 365;
        System.out.println(minutes + " minutes is approximately"
         + years + " and" + days +" days");
    }
}