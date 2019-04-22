import java.util.*;


class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //覆写 equals方法
    public boolean equals(Object obj) {
        //传入的对象和当前对象相同
        if(obj == this) {
            return true;
        }
        //传入的对象为空
        else if(obj == null) {
            return false;
        }
        //传入的对象不是Person()类的对象
        else if(! (obj instanceof Person)) {
            return false;
        }else {
            Person per = (Person) obj;
            return this.name.equals(per.name) && this.age.equals(per.age);
        }

    }

    //覆写 toString()方法
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ListInterface {
    public static void main (String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",20));
        System.out.println(list);
        System.out.println(list.contains(new Person("张三",18)));
        System.out.println(list.remove(new Person("李四",20)));
        System.out.println(list);
    }
}