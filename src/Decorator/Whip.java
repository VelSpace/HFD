package Decorator;

public class Whip extends CondimentDecorator {
    
    //has a beverage object
    Beverage beverage;
    public Whip(Beverage obj){
        beverage = obj;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+.50;
    }
    
}
