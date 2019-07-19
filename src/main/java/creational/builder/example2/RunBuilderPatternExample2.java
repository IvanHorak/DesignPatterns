package creational.builder.example2;

public class RunBuilderPatternExample2 {
    public static void main(String[] args) {

        LunchOrder.Builder orderBuilder = new LunchOrder.Builder();
        orderBuilder.bread("Walnut Bread")
                .condiments("Roasted Onions")
                .meat("Pulled Pork")
                .meat("Smoked Grilled Bacon")
                .dressing("Bernaise Sauce");

        LunchOrder lunchOrder = orderBuilder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
