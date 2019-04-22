import java.util.Scanner;

public class DecimalChangedToBinary {
    public static void main(String[] args) {
        System.out.print("亲输入一个十进制数： ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] arr = new int[10];
        int i = 0;
        while(number != 0) {
            int temp = number % 2;
            arr[i] = temp;
            i++;
            number /= 2;
        }
        System.out.print("对应的二进制数为： ");
        for(i--; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}