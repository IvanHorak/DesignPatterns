package structural.proxy;

public class RealObjectImpl implements RealObject {
    @Override
    public void doSomething() {
        System.out.println("Performing work on the real object!");
    }
}
