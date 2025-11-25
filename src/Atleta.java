import java.util.Random;

public class Atleta implements Runnable {
    Giudice giudice;
    int numero;
    String nome;
    double tempo = 0;
    double metri = 0;
    final double LUNGHEZZAGARA;
    final Random random = new Random();

    public Atleta(int pNumero, String pNome, Giudice pGiudice) {
        numero = pNumero;
        nome = pNome;
        giudice = pGiudice;
        LUNGHEZZAGARA = Giudice.LUNGHEZZAGARA;
    }

    public String getNome(){return nome;}

    @Override
    public void run() {
        while (metri < LUNGHEZZAGARA) {
            metri = metri + random.nextInt(7);
            System.out.printf("Metri Percorsi da %s: %.1f\n",nome,metri);
            try {
                Thread.currentThread().sleep(1000);
                tempo+=1;
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        giudice.registraAtletaArrivato(this);
        System.out.println(nome + " è al traguardo");
    }

}