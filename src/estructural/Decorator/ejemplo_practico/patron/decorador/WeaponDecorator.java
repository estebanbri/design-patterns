package estructural.Decorator.ejemplo_practico.patron.decorador;

import estructural.Decorator.ejemplo_practico.patron.componente.Weapon;

public abstract class WeaponDecorator implements Weapon {

    private Weapon weapon;

    public WeaponDecorator(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int attack() {
        return weapon.attack();
    }
}
