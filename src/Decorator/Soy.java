package Decorator;

public class Soy extends CondimentDecorator{

    Beverage beverage;
    public Soy(Beverage o){
        beverage = o;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost()+.80;
    }
    
}
