package creacionales.Factory_Method.patron;

import creacionales.Factory_Method.patron.factory.IEnemyFactory;
import creacionales.Factory_Method.patron.product.IEnemy;

public class Game {

    private IEnemyFactory enemyFactory;
    private IEnemy enemy;

    public Game(IEnemyFactory enemyFactory){ // DI
        this.enemyFactory = enemyFactory;
    }

    public void start(){
        enemy = this.enemyFactory.createEnemy();
        System.out.println(enemy.getWeapon());
    }

}
