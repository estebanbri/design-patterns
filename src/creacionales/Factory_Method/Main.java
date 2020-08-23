package creacionales.Factory_Method;


import creacionales.Factory_Method.patron.Game;
import creacionales.Factory_Method.patron.factory.IEnemyFactory;
import creacionales.Factory_Method.patron.factory.impl.RandomEnemyFactory;

public class Main {
    public static void main(String[] args) {
        IEnemyFactory factory;
           factory = new RandomEnemyFactory();
        // factory = new EnemyAFactory();
        // factory = new EnemyBFactory();

        Game game = new Game(factory); // DI
        game.start();
    }
}
