import java.util.Scanner;

// public class  HomeWork6 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("请输入学生人数： ");
//         int student = input.nextInt();
//         System.out.print(student + "名学生的成绩分别为： ");
//         int[] arr = new int[student];
//         for(int i = 0; i < arr.length ; i++) {
//         arr[i] = input.nextInt();  
//         }
//     for(int i = 0; i <= arr.length; i++ ) {
//         switch(arr[i] / 10 % 10) {
//             case 9:
//                     System.out.println("学生的成绩等级为 A");
//                     break;   
//             case 8:
//                     System.out.println("学生的成绩等级为 B");
//                     break;
//             case 7:
//                    System.out.println("学生的成绩等级为 C");
//                    break;
//             case 6: 
//                 if(arr[i] >= 60) {
//                     System.out.println("学生的成绩等级为 D");
//                 } break;

//             default: 
//                 if(arr[i] <= 100 && arr[i] >= 0) { 
                         
//                 if(arr[i] == 100) {
//                     System.out.println("学生的成绩等级为 A");
//                 }else {
//                     System.out.println("学生的成绩等级为 E");
//                 }
//             }else {
//                    System.out.println("分数输入异常");
//                     break;
//             }
//     }
//     }   
//     }
// }


public class HomeWork6 {
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
