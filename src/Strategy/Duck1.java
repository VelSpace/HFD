package Strategy;

public class Duck1 extends Duck {

    @Override
    public void swim() {
        System.out.println("Duck1 swims happily");       
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Duck1 : Hey How i looks like");
    }

    @Override
    public void performfly() {
        // TODO Auto-generated method stub
        System.out.println("Duck1 : I fly with 5 m/s");
        
    }

    @Override
    public void seteatBehaviour(String e) {
        // TODO Auto-generated method stub
        if(e.equalsIgnoreCase("protein")){
            eatBehaviour = new ProteinDiet();
        }else{
            eatBehaviour = new NormalDiet();
        }
    }

    @Override
    public void setflyBehaviour(String f) {
        // TODO Auto-generated method stub
        if(f.equalsIgnoreCase("wings")){
            flyBehaviour = new FlywithWings();
        }else{
            flyBehaviour = new FlyWithNoWings();
        }
    }

    
}
