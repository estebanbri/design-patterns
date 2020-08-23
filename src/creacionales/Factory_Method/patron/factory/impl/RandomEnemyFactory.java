package creacionales.Factory_Method.patron.factory.impl;

import creacionales.Factory_Method.patron.factory.IEnemyFactory;
import creacionales.Factory_Method.patron.product.IEnemy;
import creacionales.Factory_Method.patron.product.impl.EnemyA;
import creacionales.Factory_Method.patron.product.impl.EnemyB;

import java.util.Random;

public class RandomEnemyFactory implements IEnemyFactory {

    private Random r = new Random();

    @Override
    public IEnemy createEnemy() {
        int low = 1;
        int high = 3;
        int result = r.nextInt(high-low) + low;
        return result == 1 ? new EnemyA() : new EnemyB();
    }
}
