/*//饿汉式单例

class Singleton {
	private final static Singleton inter = new Singleton();
	private Singleton() { }

	public static Singleton getInter() {
		return inter;
	}

	public void fun() {
		System.out.println("饿汉式单例");
	}
}

public class SingletonNew {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInter();//对象声明
		singleton.fun();
	}
}*/




class Singleton {
	private final static Singleton inter;
	private Singleton() { }

	public static Singleton getInter() {
		if(inter == null) {
			inter = new Singleton();
		}
		return inter;
	}

	public void fun() {
		System.out.println("饿汉式单例");
	}
}

public class SingletonNew {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInter();//对象声明
		singleton.fun();
	}
}
