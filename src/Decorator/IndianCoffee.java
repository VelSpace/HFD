package Decorator;

public class IndianCoffee {
    public static void main(String[] args) {
        //Real world example is Java.io package for decorator
        //I need to drink espresso first
        Beverage beverage = new Expresso();

        System.out.println(beverage.getDescription()+" $ "+beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription()+" $ "+beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription()+" $ "+beverage2.cost());


    }
}
