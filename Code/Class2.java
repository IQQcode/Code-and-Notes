public class Class2{
//     /**递归实现 1到100的叠加 */
// public static void main(String[] args){
//     System.out.println(sum(100));
//    }
  
//    public static int sum(int num){
//        if(num == 1){
//            return 1;
//        }else {
//            return num+sum(num-1);
//        }
//    }


//  public static void main(String[] args){
//   //输出不等列数组
//   int[][] data = new int[][]{
//       {1,2,3,},{4,5},{6,7,8,9}
//   };
//   //双重循环输出
//     for(int x = 0; x < data.length;x++){
//         for(int y =0;y < data.length;y++){
//             System.out.println("data["+x+"]["+y+"] ="+data[x][y]+"、");
//         }
//         System.out.println();
//     }
//  }

//方法接受数组
public static void main(String[] args){
    int[] data = new int[] {1,2,3,4,5,6,7,8,9};
    printArray(data);//等价于 int[] temp = data;
}

public static void printArray(int[] temp){
    for(int i = 0;i < temp.length;i++){
        System.out.println(temp[i]);
    }
}


}