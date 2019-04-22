// // this调用本类属性
// class Person {
//     private String name;
//     private int age;

//     public Person(String name,int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String getPersonInfo() {
//         return "姓名:" + name + "年龄" + age;
//     }
// }
// public class Practise {
//     public static void main(String[] args) {
//         Person per = new Person("QQ",18);
//         //per.name = "QQ";
//         //per.age = 18;
//         System.out.println(per.getPersonInfo());
//     }
    
// }
    
class Person {
    public String name;
    public int age;

    public void fun() {
        System.out.println("姓名:" + name + ",年龄" + age);
    }
}
public class Practise {
    public static void main(String[] args) {
        Person per = new Person();  //产生对象，然后调用对象的属性和方法
        per.name = "马QQ";
        per.age = -18;
        per.fun();
    }
}