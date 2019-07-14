思考:如何保护没有关联关系的多个资源?不同资源使用不同的锁即可
class Account {
  // 账户余额  
  private Integer balance;
  // 账户密码
  private String password;
  // 余额锁，保护balance
  private final Object balanceLock = new Object();
  // 密码锁,保护pwd
  private final Object pwdLock = new Object(); 

  // 取款
  void withdraw(Integer amt) {
  	synchronized(balanceLock) {
      if (this.balance > amt){
        this.balance -= amt;
      }
  	}
  } 
  // 查看余额
  Integer getBalance() {
  	synchronized(balanceLock) {
      return balance;
  	}
  }
  // 更改密码
  void updatePassword(String pw){
  	synchronized(pwdLock) {
      this.password = pw;
  	}
  } 
  // 查看密码
  String getPassword() {
  	synchronized(pwdLock) {
      return password;
  	}
    }
}

进一步思考:保护有关联关系的多个资源
class Account {
  private int balance;
  // 转账
  synchronized void transfer(Account target, int amt){
    if (this.balance > amt) {
      this.balance -= amt;
      target.balance += amt;
    }
  } 
}


假设有 A、B、C 三个账户，余额都是 200 元，我们用两个线程分别执行两个转账操作：
账户 A 转给账户 B 100 元，(线程1)
账户 B 转给账户 C 100 元，(线程2)
最后我们期望的结果应该是账户 A 的余额是 100 元，
账户 B 的余额是 200 元， 
账户 C 的余额是 300 元。



class Account {
  private int balance;
  // 转账
  void transfer(Account target, int amt){
    synchronized(Account.class) {
      if (this.balance > amt) {
        this.balance -= amt;
        target.balance += amt;
      }
    }
  } 
}

思考3:如何优化?
class Account {
  private int balance;
  // 转账
  void transfer(Account target, int amt){
    // 锁定转出账户
    synchronized(this) {              
      // 锁定转入账户
      synchronized(target) {           
        if (this.balance > amt) {
          this.balance -= amt;
          target.balance += amt;
        }
      }
    }
  } 
}
上述代码还有什么问题?


// 实例1
class Sync {
    public static synchronized void test() {
        System.out.println("test方法开始，当前线程为 "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test方法结束，当前线程为 "+Thread.currentThread().getName());
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        Sync sync = new Sync() ;
        sync.test();
    }
}

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 3 ; i++) {
            Thread thread = new MyThread() ;
            thread.start();
        }
    }
}



// 实例2
// 线程1:addOne -> 10
// 线程2:get() -> value
class SafeCalc {
	static long value = 0L;
	synchronized long get() {
	    return value;
	}
	synchronized static void addOne() {
	    value += 1;
	}
}

