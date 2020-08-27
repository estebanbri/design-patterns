package estructural.Decorator.ejemplo_practico;

import estructural.Decorator.ejemplo_practico.patron.componente.Weapon;
import estructural.Decorator.ejemplo_practico.patron.componente.impl.M16;
import estructural.Decorator.ejemplo_practico.patron.decorador.impl.Silencer;

public class Main {
    public static void main(String[] args) {


        Weapon m16 = new M16(10);
        System.out.println(m16.attack());

        System.out.println("----");

        Silencer silencerM16 = new Silencer(new M16(20));
        int attackDmg = silencerM16.attack();
        System.out.println(attackDmg);

        System.out.println("----");

        silencerM16.setActive(false);
        int attackDmg2 = silencerM16.attack();
        System.out.println(attackDmg2);
    }
}
