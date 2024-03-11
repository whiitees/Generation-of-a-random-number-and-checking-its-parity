import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int losowaLiczba = rand.nextInt(10) + 1;
        System.out.println("Wylosowana liczba: " + losowaLiczba);

        if (czyParzysta(losowaLiczba)) {
            System.out.println("Liczba jest parzysta.");
        } else {
            System.out.println("Liczba jest nieparzysta.");
        }
    }

    public static boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }
}
