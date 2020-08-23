package creacionales.Factory_Method.ejemplo_practico;


import creacionales.Factory_Method.ejemplo_practico.patron.Game;
import creacionales.Factory_Method.ejemplo_practico.patron.factory.IEnemyFactory;
import creacionales.Factory_Method.ejemplo_practico.patron.factory.impl.RandomEnemyFactory;

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
