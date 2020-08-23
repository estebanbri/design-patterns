package creacionales.Factory_Method.ejemplo_practico.patron.factory.impl;

import creacionales.Factory_Method.ejemplo_practico.patron.factory.IEnemyFactory;
import creacionales.Factory_Method.ejemplo_practico.patron.product.IEnemy;
import creacionales.Factory_Method.ejemplo_practico.patron.product.impl.EnemyB;

public class EnemyBFactory implements IEnemyFactory {
    @Override
    public IEnemy createEnemy() {
        return new EnemyB();
    }
}
