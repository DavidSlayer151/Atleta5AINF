public class Main {
    public static void main(String[] args) {

        System.out.println("gara atletica");
        Atleta a1 = new Atleta(33, "Lappy");
        Atleta a2 = new Atleta(666, "DOOM Slayer");
        Thread ta2 = new Thread(a2);
        ta2.setPriority(Thread.MAX_PRIORITY);
        Thread ta1 = new Thread(a1);

        for (int i = 3; i > 0; i--) {

            System.out.println("inizio in: " + i);
        }
        System.out.println("Caratter");

    }
}
