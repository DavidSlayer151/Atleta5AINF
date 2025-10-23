import java.util.Random;

public class Atleta implements Runnable {
    int numero;
    String nome;
    double tempo = 0;
    double metri = 0;
    final double LUNGHEZZAGARA = 69;

    public Atleta(int pNumero, String pNome) {
        numero = pNumero;
        nome = pNome;
    }

    @Override
    public void run() {
        while (metri < LUNGHEZZAGARA) {
            metri = metri + Random.nextInt(7);
            System.out.println("Metri Percorsi: " + metri);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e);
        }
        System.out.println(nome + " è al traguardo");
    }

}