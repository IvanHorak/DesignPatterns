package structural.adapter;

public class RunAdapterPattern {
    public static void main(String[] args) {
        Movable veyron = new BugattiVeyron();
        MovableAdapter movableAdapter = new MovableAdapterImpl(veyron);
        System.out.println("KM/H speed: " + movableAdapter.getSpeed());
    }
}
