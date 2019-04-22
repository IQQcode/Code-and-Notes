/** this关键字 */

// 一、this调用本类属性，调用本类方法
// class Person {
//     private String name;
//     private int age;

//     //构造方法：初始化类属性
//     public Person() {
//         System.out.println("*************************");
//     }

//     public Person(String name) {
//         // 表示调用类中无参构造
//         this(); 
//     }

//     public Person(String name,int age) {
//         //表示调用类中一个参数的有参构造
//         this(name);
//         // this调用构造方法必须放在构造方法首行
//         this.age = age;
//     }

// //就近取用原则
// public Person(String n, int a) { //命名不符合java规范反，无意义；
//     name = n;
//     age = a;
// }
// public Person(String name, int age) {
// //this.name明确表示调用类中name属性，不再使用就近原则
//    this.name = name; //是类中的 name
//    this.age = age;
// }

// public void setName(String name) {
//     this.name = name;
//  }
// public String getName() {
//     return name;
//  }
// public int getAge() {
//     return age;
//  }
// }

// public class Class5 {
// public static void main(String[] args) {
//     Person per = new Person("马爸爸",18);
//     per.setName("马QQ");
//     System.out.println(per.getName());
//     System.out.println(per.getAge());
//  }
// }

// 二、this表示当前对象

// class Person {
//     public void fun() {
//         //this表示当前调用fun方法的对象
//         System.out.println("当前对象为" + this);
//         }
// }
// public class Class5 {
//     public static void main(String[] args) {
//         Person per1 = new Person(); //产生一个per1对象
//         //per1对象调用fun方法(普通方法)
//         per1.fun();
//         //此时this是 per1
//         System.out.println(per1);

//         System.out.println("**************************");

//         Person per2 = new Person();  //产生per2对象
//         //此时this是per2
//         per2.fun();
//         System.out.println(per2);
//         }
// }

/** static关键字 */
//1.类属性

// class Person {
// //普通属性或对象属性
//     private String name;
//     private int age;

//     //类属性--共享属性
//     public static String country;

// public Person(String name,int age) {
//     this.name = name;
//     this.age = age;
//  }
// public void fun() {
//     System.out.println(this.name+this.age+"在"+this.country);
//  }
// }

// public class Class5 {
//   public static void main(String[] args) {
//     Person per1 = new Person("张三",18);
//     Person per2 = new Person("李四",100);//类属性不在构造方法中赋值

//     //直接通过类名称调用(与对象无关)
//     Person.country = "中国";
//     per1.fun();
//     per2.fun();
//  }
// }

// //************************************************************************** /

//2.类方法(通过类名称直接调用)
//----描述工具类方法时，一般使用静态方法
//java.util.Arrays.sort()----排序
class Person {
    public static void fun() {
        System.out.println("当个好猿不容易，专业护发二十年！");
    }
}

public class Class5 {
    public static void main(String[] args) {
        Person.fun();
    }
}
