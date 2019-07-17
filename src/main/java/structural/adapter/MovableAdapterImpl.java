package structural.adapter;

public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCar;

    public MovableAdapterImpl(Movable movable) {
        this.luxuryCar = movable;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMH(luxuryCar.getSpeed());
    }

    private double convertMPHtoKMH(double mph) {
        return mph * 1.60934; //one mile is 1.60934 Kilometers
    }
}
