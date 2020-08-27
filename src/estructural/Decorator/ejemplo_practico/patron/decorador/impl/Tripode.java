package estructural.Decorator.ejemplo_practico.patron.decorador.impl;

import estructural.Decorator.ejemplo_practico.patron.componente.Weapon;
import estructural.Decorator.ejemplo_practico.patron.decorador.WeaponDecorator;


public class Tripode extends WeaponDecorator {

    private boolean isActive = true;
    private static final int ATTACK_INCREASE = 33;

    public Tripode(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int attack() {
        return isActive? super.attack() + ATTACK_INCREASE : super.attack();
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
