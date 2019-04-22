public class Class1 {
    // public static void main (String[] args){
    // int num1 = 10;
    // double num2 = 10.5;
    // String result = "计算结果："+ num1 + num2;//此时，+是字符连接；
    // System.out.print(result);
    // }

    // public static void main(String[] args){
    // int i = 0,j = 0,X = 0;
    // int line = 0;
    // System.out.print("打印乘法口诀表:");

    // for(i = 1;i <= 9; i++){

    // System.out.println( );

    // for(j=1;j <= i;j++){

    // System.out.print(i + "*" + j + "=" + i * j+"\t");

    // }
    // }
    // }

    // public static void main(String[] args) throws Exception{
    // System.out.println("请输入字符：");
    // char x = (char) System.in.read();
    // switch (x){
    // case 'a':{
    // System.out.println("我是猪");
    // break;
    // }
    // case 'b':{
    // System.out.println("我不是猪");
    // break;
    // }
    // default:{
    // System.out.println("我真的不是猪！");
    // break;
    // }
    // }
    // }

    //

    public static void main(String[] args) {

        // Java中字符串的拼接直接用 '+';
        // String str1 = "为了年薪26W+";
        // String str2 = "必须努力奋斗鸭！";
        // String str3 = "断断续续的努力是没用用的";
        // String str4 = "你能坚持de住吗？";
        // System.out.println(str1+str2);
        // System.out.println(str3+str4);

        // 图案打印：
        int line = 10;
        for (int x = 0; x < line; x++) { // 控制行数

            for (int y = 0; y < line - x; y++) {// 控制空格

                System.out.print(" ");
            }

            for (int z = 0; z < x; z++) {

                System.out.print("* ");// * 后面有空格，打印等边三角形；没有空格打印直角三角形；
            }
            System.out.println();// 换行
        }

        // 数组的输出：
        // for(int i = 0;i < args.length;i++){

        // System.out.println(args[i]);
        // //数组放值时在解释命令后加入
        // //java Class1 Hello world,Java
        // }

        /** for-each循环，用于数组输出*/ 
        // for(String str:args){
        // System.out.print(str);
        // }

    }

    // 方法的定义与使用（形参只有值传递）
    // PS：本节课所有方法在 主类 中定义，在 主方法 中直接调用；

}
