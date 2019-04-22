// // class Person {
// //     public void fun() {
// //         this.print();
// //     }
// //     void print(){
// //         System.out.println("1.Person类中的print方法！");
// //     }
// // }

// // class Student extends Person {
// //     public void print() {
// //         System.out.println("2.Student类中的print方法！");
// //     }
// // }

// // public class Override {
// //     public static void main(String[] args) {
// //         Student stu = new Student();
// //         stu.fun();
// //     }
// // }

// //************************************************************************* */
// //方法覆写不能出现private
// class Person {
//     public void fun() {
//         this.print();
//     }
//     private void print(){  //被private修饰后，子类不能直接调用，该方法只能被父类使用
//                         // (子类不知道父类有这样的方法)
//         System.out.println("1.Person类中的print方法！");
//     }
// }

// class Student extends Person {
//     public void print() {
//         System.out.println("2.Student类中的print方法！");
//     }
// }

// public class Override {
//     public static void main(String[] args) {
//         Student stu = new Student();
//         stu.fun();
//     }
// }




//**************************************************************************** */

// class Person {
//     public String info = "Fighting";
//     public void print() {
//         System.out.println("1.Person");
//     }
// } 

// class Student extends Person {
//     public void print() {
        
//         //表示调用父类的属性；
//          System.out.println(super.info);
        
//          //表示调用父类的 print()方法；
//         super.print();
//         System.out.println("2.Student");
//     }
// }

// public class Override {
//     public static void main(String[] args) {
//         Student stu = new Student();
//         stu.print();
//     }
// }




// class Person{
//     public String name;
//     public int age;
    
//     public void fun() {
//         System.out.println("姓名:" + name + "年龄:" + age);
//     }
//     }

// public class Override {
//     public static void main(String[] args) {
//         Person per = new Person();// 声明并实例化对象(对象产生)
//         per.name = "马QQ";//操作属性姓名
//         per.age = 18;//操作属性年龄
//         per.fun();//调用类中的fun()方法
//     }
// }

public class Override {
    public static void main(String[] args) {
        double i =6;
        long mid = 0;
        for(double j = 0; j<10; j++) {
            mid += i * Math.power(10,j);
            result += mid;
        }
        System.out.println(result);
    }
}