//继承，调用子类构造方法前，一定先调用父类的构造方法
class Person {
    public Person() {
      System.out.println("**Person类对象产**");
    }
  }
  
   class Student extends Person {
     public Student() {
       super();
       System.out.println("**Student类对象产**");
     }
   }
  
  public class Class6 {
    public static void main(String[] args) {
    new Student();
    }
  }


//单继承
class A {}

class B extends A {}

class C extends B {}

public class Class6 {
  public static void main(String[] args) {
    new C();
  }
}

//隐式继承、显式继承
class Person {
  private String name;//隐式继承
    public void setName(String name) {
         this.name = name;
    }
    public String getName() {
         return this.name;
  }
}


class Student extends Person {}

public class Class6 {
  public static void main(String[] args) {
    Student stu = new Student();
    stu.setName("张三");
    System.out.println(stu.getName());
  }
}



//方法的覆写
//方法覆写发生在有继承关系的类之间，子类定义了与父类相同的方法
//(方法名称相同，参数的个数、类型、返回值全部相同)

//子类权限 >= 父类，且不能出现private权限
// private < default < public

// class Person {
//   public void print() {
//     System.out.println("1.[Person] 类的print方法");
//   }
// }

// class Student extends Person {
//   public void print() {
//     System.out.print("2.[Student] 类的print方法");
//   }
// }

// public class Class6 {
//   public static void main(String[] args) {
//     new Student().print();
//   }
// }



// /** final关键字*/

// //final修饰类,无法使用 "extends" 继承该类(错误例子)
// final class Person {
//   public void print() {
//   }
// }

// //final修饰的方法无法被覆写(错误例子)

// class Person {
//   public final void print() {
//   }
// }

// class Student extends Person {
//   public void print() {

//   }
// }

// public class Class6 {
//   public static void main(String[] args) {
//     new Student();
//   }
// }

// //美团笔试题
// public class Class6 {
//         byte b1=2,b2=3,b3=4,b6,b8;
//   final byte a4=4,a5=5,a7=7;
//   public void test() {
//     //b3 = (b1 + b2);// int + int != byte   //b3 =(byte)(b1 + b2);
//     b6 = (a4 + a5);// <正确>仍为 byte
//     //a7 = (b1 + a5);// java中常量赋值后不可再改变
//     //b8 = (b1 + a4);// int + byte得强转
//   }
//   public static void main(String[] args) {
//      new Class6().test();
//   }
// }


