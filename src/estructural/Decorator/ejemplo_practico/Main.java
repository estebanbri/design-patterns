package estructural.Decorator.ejemplo_practico;

import estructural.Decorator.ejemplo_practico.patron.componente.Weapon;
import estructural.Decorator.ejemplo_practico.patron.componente.impl.M16;
import estructural.Decorator.ejemplo_practico.patron.decorador.impl.Silencer;

public class Main {
    public static void main(String[] args) {

        Weapon m16 = new M16();
        System.out.println(m16.attackDamage());

        Weapon silencer = new Silencer(m16);
        //silencer.display();
        System.out.println(silencer.attackDamage());

    }
}
