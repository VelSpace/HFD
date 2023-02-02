package Strategy2;

public class King extends Character{

    @Override
    public void fight(String s) {
        // TODO Auto-generated method stub
        weaponBehaviour.useWeapon(s);
    }

    @Override
    public void setWeaponBehaviour(WeaponBehaviour w) {
        // TODO Auto-generated method stub
        weaponBehaviour = w;
        
    }
    
}
