package Factory2;

public class NYStyleCheesePizza extends Pizza{

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        System.out.println("New york style cheese pizza preparing........");
    }

    @Override
    public void bake() {
        // TODO Auto-generated method stub
        System.out.println("New york style cheese pizza baking........");
    }

    @Override
    public void cut() {
        // TODO Auto-generated method stub
        System.out.println("New york style cheese pizza cutting........");
    }

    @Override
    public void box() {
        // TODO Auto-generated method stub
        System.out.println("New york style cheese pizza boxing........");
    }
    
}
