package structural.proxy;

public class RealObjectProxy extends RealObjectImpl {

    @Override
    public void doSomething() {
        if (safetyChecksPass()) {
            System.out.println("Delegating work on real object");
            super.doSomething();
        }
    }

    private boolean safetyChecksPass() {
        System.out.println("I'm doing serious safety checks!");
        return true; //This is bad practice but I am just fulfilling the need of a return statement
    }
}
