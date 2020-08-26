package estructural.Decorator.ejemplo_practico.patron.decorador.impl;

import estructural.Decorator.ejemplo_practico.patron.componente.Weapon;
import estructural.Decorator.ejemplo_practico.patron.decorador.WeaponDecorator;

import java.io.*;

public class Silencer extends WeaponDecorator {

    private final int atackDamageReduction = 30;

    public Silencer(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int attackDamage() {
        return super.attackDamage() - atackDamageReduction;
    }

    @Override
    public void display() {
        super.display();
        addSilencerBehavior();
    }

    private void addSilencerBehavior() {
        System.out.print(" Silencer Added : ");
        System.out.print(" { Attack damage : " + this.attackDamage());
        System.out.print(", Attack damage reduced by: " + atackDamageReduction + "}");
    }
}
