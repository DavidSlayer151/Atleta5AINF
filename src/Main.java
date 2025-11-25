public class Main {
    public static void main(String[] args) throws InterruptedException {
        Giudice giudice = new Giudice();

        System.out.println("gara atletica");
        Atleta a1 = new Atleta(33, "Lappy", giudice);
        Atleta a2 = new Atleta(666, "DOOM Slayer", giudice);

        Thread ta2 = new Thread(a2);
        ta2.setPriority(Thread.MAX_PRIORITY);
        Thread ta1 = new Thread(a1);

        giudice.comunicaInizio();

        ta1.start();
        ta2.start();

        try {
            ta1.join();
            ta2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        giudice.comunicaFine();

    }
}
