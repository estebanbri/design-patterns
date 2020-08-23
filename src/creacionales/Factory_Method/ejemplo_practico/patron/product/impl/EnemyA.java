package creacionales.Factory_Method.ejemplo_practico.patron.product.impl;

import creacionales.Factory_Method.ejemplo_practico.patron.product.IEnemy;

public class EnemyA implements IEnemy {
    @Override
    public String getWeapon() {
        return "Sword";
    }
}
