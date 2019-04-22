public class Pratise1 {

      //1.乘法口诀表输出

//     public static void main(String[] args) {
        
//         for(int i = 1; i <= 9; i++) {
//             System.out.println();
//             for(int j = 1;j <= i;j++ ) {
//                 System.out.print(i + "*"+ j + "=" + i*j+"\t");
//             }
//         }
// }

      //2.图案输出

//    public static void main(String[] args) {
//        int line = 10;
//        for(int i = 0;i < line; i++) { //控制行数

//            for(int j = 0; j < line - i; j++) { //控制空格
//                System.out.print(" ");
//            }
//            for(int k = 0; k < i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

         //3.求斐波那契数列
    //  public static void main(String[] args) {
    //      int fab1 = 1;
    //      int fab2 = 1;
    //      System.out.println(fab1);
    //      System.out.println(fab2);
    //      for(int i =0; i < 20; i++) {
    //          int fab3 = fab1 + fab2;
    //          System.out.println(fab3);            
    //          fab1 = fab1 + fab2;
    //          fab2 = fab1 + fab2;
    //      }
    //  }

         //4.取模 % --拿到每一位数字

    // public static void main(String[] args) {
    //     int num = 123;
    //     int unit = num % 10;
    //     int decade = (num / 10) % 10;
    //     int hundred = num /100;
    //     System.out.println(unit);
    //     System.out.println(decade);
    //     System.out.println(hundred);        
    // }

        //5.递归求和

    public static void main(String[] args) {
        System.out.print(AddToal(100));
    }
    public static int AddToal(int x) {
        if(x == 1) {
            return 1;
        } else{
            return x + AddToal(x-1);  //不可以是 x--,x是形参，每次取时 x==100
        }
    }

}