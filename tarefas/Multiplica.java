package tarefas;

public class Multiplica extends Thread {
    private String nome;
    private int valorMultiplicar;
    private int tempo;

    public Multiplica(String nome, int valor) {
        this.nome = nome;
        this.valorMultiplicar = valor;
        this.start();
    }

    public void run() {
        System.out.println("Nome: " + this.nome);

        for (int x = 0; x <= 10; x++) {
            System.out.println(this.valorMultiplicar + " x " + x + " = " + (this.valorMultiplicar * x));
            try {
                this.sleep(tempo);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println("Fim da Thread " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorMultiplicar() {
        return valorMultiplicar;
    }

    public void setValorMultiplicar(int valorMultiplicar) {
        this.valorMultiplicar = valorMultiplicar;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    
}