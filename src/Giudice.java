import com.sun.tools.javac.Main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Giudice {
    final static double LUNGHEZZAGARA = 69;
    List<Atleta> atletiArrivati = new ArrayList<>();
    String nomefillet = "classifica.txt";

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
        scriviRank();
    }

    public synchronized void registraAtletaArrivato(Atleta a){
        atletiArrivati.add(a);
    }

    public void mostraClassifica(){
        for(int i=0;i<atletiArrivati.size();i++){
            System.out.printf("%d° %s\n", i+1, atletiArrivati.get(i).getNome());
        }
    }

    public void scriviRank(){
        try (FileWriter writer = new FileWriter(nomefillet)){
            writer.write("Clasifica: ");
            for(int i=0;i<atletiArrivati.size();i++){
                writer.write(String.format("%d° %s\n", i+1, atletiArrivati.get(i).getNome()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
