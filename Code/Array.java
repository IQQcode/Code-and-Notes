// public class Array {
//     public static void main(String[] args){
//         int[] x = null;
//         int[] temp = null;
//         x = new int[3];
//         System.out.println(x.length);
//         x[0] = 10;//数组第一个元素；
//         x[1] = 20;
//         x[2] = 30;
//         temp = x;  //修改数组元素时不用加[],直接赋值修改
//         temp[0] = 55;
//         System.out.println(x[0]);
//         for(int i = 0;i<x.length;i++){
//        System.out.println(x[i]);     
//         }
//     } 

// }

//public class Array{
    //动态初始化
//public static void main(String[] args){

//    int[] data = null;// 栈内存开辟空间，指向为空；
//    data = new int[3]; // 栈内存指向堆内存；
//    data[0] = 1;
//    data[1] = 2;
//    data[2] = 3;
//    for(int i = 0;i < data.length; i++){
//        System.out.print(data[i] + "、");
//    }
//  }

/**引用传递：多个栈内存指向相同的堆内存 */
// int[] data = null;
//    data = new int[3]; // 栈内存指向堆内存；
//    int[] temp = null;
//    data[0] = 1;
//    data[1] = 2;
//    data[2] = 3;
//    for(int i = 0;i < data.length; i++){
//        System.out.print(data[i] + "、");
//    }
//    temp = data;
//    temp[0] = 66;
//    System.out.println(temp[0]);

/**匿名数组 */
//System.out.println(new int[]{1,2,3,4,5,6});
//没有栈内存指向的数组空间，且只能使用一次；不知道栈内存指向，无法找到地址

/**数组与方法操作 */
//   int[] data = Init();
//  //引用传递
//   printArray(data);
//   System.out.println();
//   Change(data);
//   printArray(data);
//    }

//    //一、定义方法返回数组
//    public static int[] Init() {
//     //匿名数组
//     return new int[]{1,3,5,7,9};//通过data和temp的联系，可以找到此数组；
//    }

//    //二、定义一个方法用来输出整型数组
//    public static void printArray(int[] temp){
//        for(int i: temp) {
//            System.out.print(i + "、");
//        }
//    }
//    //三、定义方法修改数组
//    public static void Change(int[] temp){
//        for(int i = 0;i < temp.length; i++){
//            temp[i] *= 2;
//        }
//    }

// }


/** JAVA 对数组的支持 */
public class Array {

    //********排序支持**********"java.util.Arrays.sort(数组名)；"
    // public static void main(String[] args){
    //     int[] data = new int[]{99,58,69,2,5,6,3,1,78};
    //     char[] arr = new char[]{'z','c','k','A','Z','呵'};
    //     java.util.Arrays.sort(data);
    //     java.util.Arrays.sort(arr);
    //     printArray(data);
    //     printArray(arr);
    // }

    //    public static void printArray(int[] temp) {
    //    for(int i: temp) {
    //        System.out.print(i + "、");
    //    }
    // }

    //    //方法重载
    //    public static void printArray(char[] temp) {
    //     //    for(char c: temp) {
    //     //        System.out.print(c + "、");
    //     //    }
    //     for(int i = 0;i < temp.length; i++) {
    //         System.out.print(temp[i] + "、");  //注意俩种输出方法的输出语法；            
    //     }
    //    }

    //二、实现部分数组拷贝 “Sysstem.arraycopy(源数组名称，源数组开始点，目标数组名称，目标数组开始点，拷贝长度)”
    //三、数组全拷贝（实现数组的扩容） java.util.Array.copyOf(源数组名称，新数组长度)
       public static void main(String[] args) {
           int[] data1 = new int[]{1,2,3,4,5};
           int[] data2 = new int[]{6,7,8,9,10};

           System.arraycopy(data2,2,data1,2,3);
           printArray(data1);
           System.out.println();
           int[] result =java.util. Arrays.copyOf(data1,10);
           printArray(result);           
       }

          public static void printArray(int[] temp) {
       for(int i: temp) {
           System.out.print(i + "、");
       }
    }

}