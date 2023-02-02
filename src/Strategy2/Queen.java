package Strategy2;

public class Queen extends Character{

    @Override
    public void fight(String s) {
        weaponBehaviour.useWeapon(s);        
    }

    @Override
    public void setWeaponBehaviour(WeaponBehaviour w) {
        weaponBehaviour = w;
    }
    
}
