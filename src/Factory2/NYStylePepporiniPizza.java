package Factory2;

public class NYStylePepporiniPizza extends Pizza{

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        System.out.println("New york style pepporini pizza preparing........");
    }

    @Override
    public void bake() {
        // TODO Auto-generated method stub
        System.out.println("New york style pepporini pizza baking........");
    }

    @Override
    public void cut() {
        // TODO Auto-generated method stub
        System.out.println("New york style pepporini pizza cutting........");
    }

    @Override
    public void box() {
        // TODO Auto-generated method stub
        System.out.println("New york style pepporini pizza boxing........");
    }
    
}
