package creacionales.Factory_Method.patron.factory.impl;

import creacionales.Factory_Method.patron.factory.IEnemyFactory;
import creacionales.Factory_Method.patron.product.IEnemy;
import creacionales.Factory_Method.patron.product.impl.EnemyB;

public class EnemyBFactory implements IEnemyFactory {
    @Override
    public IEnemy createEnemy() {
        return new EnemyB();
    }
}
