package Strategy2;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;

    public abstract void fight(String s);

    public abstract void setWeaponBehaviour(WeaponBehaviour w);
    
}
