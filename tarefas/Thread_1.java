/*package tarefas;

public class Thread_1 extends Thread{
    private String nome;
    private int vf;
    private int tempo;

    public Thread_1(final String nome, final int valor){
        this.nome = nome;
        this.vf = valor;
        this.start();
    }

    public void run(){
        System.out.println("Nome: "+this.nome);
            int total = 1;
        for(int i = this.vf; i>1; i--){
            total*=i;

            System.out.println("Fatorial de "+this.vf+" = "+this.vf+" ! "+" = "+total);
            try{
                this.sleep(tempo);
            }
            catch(final InterruptedException e){
                e.printStackTrace();
            }
        System.out.println("Processo 1 - Valor final: "+total);    
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVf() {
        return vf;
    }

    public void setVf(int vf) {
        this.vf = vf;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}*/