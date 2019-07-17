package structural.decorator;

public class Garland extends TreeDecorator {
    private ChristmasTree tree;

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }


}
