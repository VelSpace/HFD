package Decorator;

public class Mocha extends CondimentDecorator{

    //has a beverage object
    Beverage beverage;
    public Mocha(Beverage obj){
        beverage = obj;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+.20;
    }
    
}
