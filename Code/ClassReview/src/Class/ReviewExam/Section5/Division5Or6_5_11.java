package Class.ReviewExam.Section5;

public class Division5Or6_5_11 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("可以被5整除的数为： ");
        for(int i = 100;i <= 200;i++) {
            if(i % 5 == 0 && i % 6 !=0 ) {
                if(count % 10 == 0)
                    System.out.println();
                System.out.print( i + " ");
                count++;
            }
        }
        System.out.print( "\n可以被6整除的数为： ");
        count = 0;
        for(int i = 100;i<=200;i++) {
            if(i % 5 != 0 && i % 6 == 0) {
                if(count % 10 == 0)
                    System.out.println();
                System.out.print( i + " ");
                count++;
            }
        }
    }
}
