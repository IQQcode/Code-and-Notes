//Java数组章节练习题
// public class HomeWork{

//     //1.计算数组中最大值
//     public static int arrayMaxElement(int[] data){
//          int Max = data[0];
//          for(int i = 0;i < data.length;i++) {
//              if(data[i] > Max){
//                  Max = data[i];
//              }
//          }
//         return Max;
//     }
    
//     //2.计算数组中最小值
//     public static int arrayMinElement(int[] data){
//         int Min = data[0];
//          for(int i =0;i < data.length;i++) {
//              if(data[i] < Min){
//                  Min = data[i];
//              }
//          }
//         return Min;
//     }
    
    
//     //3.计算数组值之和
//     public static int arrayElementSum(int[] data) {
//         int sum = 0;
//         for(int i = 0;i < data.length; i++) {
//               sum = sum + data[i];
//         }
//         return sum;
//     }
    
//     //4.数组拼接
//     // A {1,3,5,7,9} B {2,4,6,8,10} -> {1,3,5,7,9,2,4,6,8,10}
//     public static int[] arrayJoin(int[] a, int[] b){
//         int[] result = new int[a.length + b.length];
//         for(int i =0;i < a.length; i++) {
//             result[i] = a[i];
//         }
//         for(int j = 0;j < b.length; j++) {
//             result[a.length + j] = b[j];
//         }
//         return result;
//     }

//     //5.数组截取
//     //[start, end)
//     // A {1,3,5,7,9} ->(A,1,3) > {3,5}
//     public static int[] arraySub(int[] A, int start , int end) {
//         int[] result0 = new int[end - start];
//         int tab = 0;
//         for(int i = start; i < end; i++ ) {
//             result0[tab] = A[i];  // tab控制A的每一个元素给result的赋值；
//             tab++;
//         }
//         return result0;
//     }
    
//     //6.数组打印
//     public static void printArray(int[] data){
//         for(int i : data){
//             System.out.print(i  + "、");
//         }
//     }
    
//     //7.数组反转
//     // 比如：[1,2,3,4] => [4,3,2,1]
//     public static void printReversal(int[] A){
//         for(int i = A.length - 1; i >= 0; i--) {
//             System.out.print(A[i]  + "、");
//         }
//     }
    
//     public static void main(String[] args){
//         //TODO 测试
//         int[] data = new int[] {1,22,5,99,66,369,36,58,2}; 
//         int[] A = new int[]{1,3,5,7,9};
//         int[] B = new int[]{2,4,6,8,10};  

//         System.out.println("Max = " + arrayMaxElement(data)); 
//         System.out.println("Min = " + arrayMinElement(data));   
//         System.out.println("Sum = " + arrayElementSum(data));
//         printArray(data);

//         int[] result = arrayJoin(A,B);
//         System.out.println();
//         printArray(result);
//         System.out.println();

//         int[] result0 = arraySub(A,1,3);
//         printArray(result0);
//         System.out.println();
        
//         printReversal(A);
//     }
// }


//递归实现 20！
public class HomeWork {
public static void main(String[] args) {
    int sum = 0;
    int i = 20;
    sum = Fac(i);
    System.out.println(sum);
}
public static long Fac(int a) {
    int result = 1;
    for(int m = 0; m <= a; m++) {
        if(m == 0) {
            result = 1L;  //出口改为long; 
        } else {
            result *= m; 
        }
    }
    return result;
}
}