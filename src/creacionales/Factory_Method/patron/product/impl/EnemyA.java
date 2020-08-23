package creacionales.Factory_Method.patron.product.impl;

import creacionales.Factory_Method.patron.product.IEnemy;

public class EnemyA implements IEnemy {
    @Override
    public String getWeapon() {
        return "Sword";
    }
}
