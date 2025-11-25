import com.sun.tools.javac.Main;

import java.util.*;

public class Giudice {
    final static double LUNGHEZZAGARA = 69;
    List<Atleta> atletiArrivati = new ArrayList<>();

    public void comunicaInizio(){
        for (int i = 3; i > 0; i--) {
            System.out.println("Inizio in: " + i);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void comunicaFine(){
        System.out.println("=== Fine gara ===");
        mostraClassifica();
    }

    public synchronized void registraAtletaArrivato(Atleta a){
        atletiArrivati.add(a);
    }

    public void mostraClassifica(){
        for(int i=0;i<atletiArrivati.size();i++){
            System.out.printf("%d° %s\n", i+1, atletiArrivati.get(i).getNome());
        }
    }

}
