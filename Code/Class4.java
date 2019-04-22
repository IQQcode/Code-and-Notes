/**面向对象编程 -- 类与对象（上）  */

//类的定义
// class Person {
//     //属性定义   属性类型，属性方法
//     public String name;
//     public int age;

//     //方法定义
//     public void fun() {
//       System.out.println(name + "在" + age + "是屌丝" );
//     } 
// }

//对象产生语法

//类名称  对象引用 = new 类名称();
//Person per = new Person();


// public class Class4 {
//     public static void main(String[] ages) {
//         //根据Person类产生一个Person对象
//         Person per = new Person();
//         //调用属性或对象都用 “  . ”
//         per.name = "马爸爸";
//         //引用传递
//         Person per1 = per;
//         per1.name = "马QQ";
//         per.age = 50;
//         per.fun();
//     }
// }

/** private 实现封装 */

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(0>=age || age<=100) {
            this.age = age;
        } else {
            System.out.println("年龄有误！");
        }
    }
    public String  getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void fun() {
        System.out.println("姓名:" + name + ",年龄" + age);
    }
}
public class Class4 {
    public static void main(String[] args) {
        Person per = new Person();
        per.setName("马爸爸");
        per.setAge(101);
        per.fun();
    }
}




/** 构造方法 */
// class Person {
//     private String name;
//     private double salary;

//     //构造方法的重载 
//     public Person() {         //无参构造
//         System.out.println("******************");
//     }
//     public Person(String n) { //有参构造
//         name = n;
//     }
//     public Person(String n,double s) {
//         name = n;
//         salary = s;
//     }

//     public void setName(String n) {
//         name = n; //在类的内部，可以访问
//     }
//     public void setSalary(double s) {
//         if(s < 0 || s > 10000) {
//             System.out.println("余额数量非法！");
//         } else {
//             salary = s;
//         }
//     }
//     public String getName() {
//         return name;
//     }
//     public double getSalary() {
//         return salary;
//     }
//     public void fun() {
//       System.out.println(name + "存款为" + "￥" + salary);
//     }
// }
// public class Class4 {
//     public static void main(String[] ages) {
//         Person per = new Person("马QQ",200);
//         Person per = new Person();  //调用无参构造
//         //per.setName("马QQ" );
//         //per.setSalary(-100);
//         per.fun();
//     }
// }
