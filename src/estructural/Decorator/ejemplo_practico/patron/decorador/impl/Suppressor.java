package estructural.Decorator.ejemplo_practico.patron.decorador.impl;

import estructural.Decorator.ejemplo_practico.patron.componente.Weapon;
import estructural.Decorator.ejemplo_practico.patron.decorador.WeaponDecorator;


public class Suppressor extends WeaponDecorator {

    private final int attacDamageReduction = 10;

    public Suppressor(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int attackDamage() {
        return super.attackDamage() - attacDamageReduction;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("Suppressor added : ");
        System.out.print(" { Attack damage reduced by: " + attacDamageReduction);
        System.out.println(" Final attack damage : " + this.attackDamage() + " }");
    }
}
