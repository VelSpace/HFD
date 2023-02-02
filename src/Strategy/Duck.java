package Strategy;

public abstract class Duck {

    //encapsulate different logics from different class or interfaces
    public EatBehaviour eatBehaviour;
    public FlyBehaviour flyBehaviour;

    public abstract void swim();
    public abstract void display();
    public abstract void performfly();

    public abstract void seteatBehaviour(String e);
    public abstract void setflyBehaviour(String f);

    
}
