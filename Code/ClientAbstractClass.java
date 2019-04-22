 abstract class AbstractClass {

    protected boolean isNeedUnlock = true;  // 默认需要开锁
    
    /**
     * 基本方法，子类需要实现
     */
    protected abstract void unlock();
    
    /**
     * 基本方法，子类需要实现
     */
    protected abstract void ride();
    
    /**
     * 钩子方法，子类可实现
     *
     * @param isNeedUnlock
     */
    protected void isNeedUnlock(boolean isNeedUnlock) {
        this.isNeedUnlock = isNeedUnlock;
    }
    
    /**
     * 模板方法，负责调度基本方法，子类不可实现
     */
    public final void use() {
        if (isNeedUnlock) {
            unlock();
        } else {
            System.out.println("========锁坏了，不用解锁========");
        }
        ride();
    }
}

    // 扫码开锁的单车
 class ScanBicycle extends AbstractClass {

    protected void unlock() {
        System.out.println("========" + "扫码开锁" + "========");
    }
    
    protected void ride() {
        System.out.println(getClass().getSimpleName() + "骑起来很拉风");
    }
    
    protected void isNeedUnlock(boolean isNeedUnlock) {
        this.isNeedUnlock = isNeedUnlock;
    }
}

// 密码开锁的单车
 class CodeBicycle extends AbstractClass {

    protected void unlock() {
        System.out.println("========" + "密码开锁" + "========");
    }
    
    protected void ride() {
        System.out.println(getClass().getSimpleName() + "骑起来很拉风");
    }
    
    protected void isNeedUnlock(boolean isNeedUnlock) {
        this.isNeedUnlock = isNeedUnlock;
    }
}
class ClientAbsractClass {

    public static void main(String[] args) {
        AbstractClass scanBicycle = new ScanBicycle();
        scanBicycle.isNeedUnlock(false);
        scanBicycle.use();
    
        CodeBicycle codeBicycle = new CodeBicycle();
        codeBicycle.isNeedUnlock(true);
        codeBicycle.use();
    }
}