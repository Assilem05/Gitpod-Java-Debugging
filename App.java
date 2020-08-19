import tarefas.Multiplica;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
       Multiplica m = new Multiplica("Multiplicação 1", 5);
       m.setTempo(1000);
       //m.start();

       Multiplica m2 = new Multiplica("Multiplicação 2", 10);
       m2.setTempo(500);
    }
}