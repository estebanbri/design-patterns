package estructural.Decorator.ejemplo_practico;

import estructural.Decorator.ejemplo_practico.patron.componente.Weapon;
import estructural.Decorator.ejemplo_practico.patron.componente.impl.M16;
import estructural.Decorator.ejemplo_practico.patron.decorador.impl.Silencer;
import estructural.Decorator.ejemplo_practico.patron.decorador.impl.Tripode;

public class Main {
    public static void main(String[] args) {


        Weapon m16 = new M16(10);
        System.out.println("Stock M16 dmg: " + m16.attack());

        System.out.println("----");

        Silencer silencerM16 = new Silencer(new M16(20));
        int attackDmg = silencerM16.attack();
        System.out.println("Silencer added to M16 dmg: " + attackDmg);

        silencerM16.setActive(false);
        int attackDmg2 = silencerM16.attack();
        System.out.println("Silencer removed to M16 dmg " + attackDmg2);

        System.out.println("----");

        Tripode tripodeSilencerM16 = new Tripode(new Silencer(new M16(20)));
        int attackDmg3 = tripodeSilencerM16.attack();
        System.out.println("Tripode and silencer added to M16 dmg " + attackDmg3);

        tripodeSilencerM16.setActive(false);
        int attackDmg4 = tripodeSilencerM16.attack();
        System.out.println("Tripode removed to M16 dmg " + attackDmg4);


    }
}
