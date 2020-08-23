package creacionales.Factory_Method.ejemplo_practico.patron.product.impl;

import creacionales.Factory_Method.ejemplo_practico.patron.product.IEnemy;

public class EnemyB implements IEnemy {
    @Override
    public String getWeapon() {
        return "Gun";
    }
}
