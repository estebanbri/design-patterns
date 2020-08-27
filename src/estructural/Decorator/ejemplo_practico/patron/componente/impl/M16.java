package estructural.Decorator.ejemplo_practico.patron.componente.impl;

import estructural.Decorator.ejemplo_practico.patron.componente.Weapon;

public class M16 implements Weapon {

    private int damage;

    public M16(int damage) {
        this.damage = damage;
    }

    @Override
    public int attack() {
        return damage;
    }
}
