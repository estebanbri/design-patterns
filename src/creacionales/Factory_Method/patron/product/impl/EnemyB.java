package creacionales.Factory_Method.patron.product.impl;

import creacionales.Factory_Method.patron.product.IEnemy;

public class EnemyB implements IEnemy {
    @Override
    public String getWeapon() {
        return "Gun";
    }
}
