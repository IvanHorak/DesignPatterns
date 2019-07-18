package structural.proxy;

public class RunProxyPattern {
    public static void main(String[] args) {
        RealObject proxy = new RealObjectProxy();
        proxy.doSomething();
    }
}
