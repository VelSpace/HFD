package Factory2;

public class Main {
    public static void main(String[] args) {
        PizzaStore obj = new NYPizzaStore();
        Pizza pizza = obj.orderPizza("cheese");
    }
}
