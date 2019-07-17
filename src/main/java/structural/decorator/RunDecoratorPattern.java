package structural.decorator;

public class RunDecoratorPattern {
    public static void main(String[] args) {
        ChristmasTree decoratedTree = new Garland(new BubbleLights(new ChristmasTreeImpl()));

        System.out.println(decoratedTree.decorate());

    }
}
