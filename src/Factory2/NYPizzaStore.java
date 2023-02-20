package Factory2;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza create(String type) {
        if(type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else if(type.equals("pepperoni")) {
            return new NYStylePepporiniPizza();
        }
        return null;
    }
    
}
