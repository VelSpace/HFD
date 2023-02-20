package Factory2;

public abstract class PizzaStore {

    public abstract Pizza create(String type);
    
    public Pizza orderPizza(String type){

        Pizza pizza = create(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
