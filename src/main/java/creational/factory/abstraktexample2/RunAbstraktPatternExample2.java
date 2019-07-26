package creational.factory.abstraktexample2;

public class RunAbstraktPatternExample2 {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card);

        abstractFactory = CreditCardFactory.getCreditCardFactory(450);
        CreditCard secondCard = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(secondCard);
    }
}

