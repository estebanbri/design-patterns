package estructural.Decorator.ejemplo_practico.patron.componente.impl;

import estructural.Decorator.ejemplo_practico.patron.componente.Weapon;

public class M16 implements Weapon {

    private int magazineSize;
    private int attackDmg;
    private int speed;

    public M16() {
        this.magazineSize = 10;
        this.attackDmg = 100;
        this.speed = 10;
    }

    @Override
    public int attackDamage() {
        return attackDmg;
    }

    @Override
    public void display()  {
        System.out.print(" Stock M16 : ");
        System.out.print(" { Magazine size = " + this.magazineSize);
        System.out.print(" , Attack damage = " + this.attackDmg);
        System.out.println(" , Attack speed = " + this.speed + " }");
    }

}
