public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu z użyciem konstruktora 1
        Produkt produkt1 = new Produkt("Myszka", "Bezprzewodowa myszka", 51.99, 10, 0.2, true);

        // Tworzenie obiektu z użyciem konstruktora 2
        Produkt produkt2 = new Produkt("Klawiatura", 250.99, 7);

        // Tworzenie obiektu z użyciem konstruktora 3
        Produkt produkt3 = new Produkt("Sluchawki");

        // Tworzenie obiektu z użyciem konstruktora 1 i zmiana wartości pola "opis"
        Produkt produkt4 = new Produkt("Monitor", "27-calowy monitor", 1500.50, 2, 5.5, true);
        produkt4.setOpis("27-calowy monitor z 4K");

        // Tworzenie obiektu z użyciem konstruktora 2 i zmiana wartości pola "dostepny"
        Produkt produkt5 = new Produkt("Laptop", 5100, 3);
        produkt5.setDostepny(false);

        // Tworzenie obiektu z użyciem konstruktora 3 i ustawienie wszystkich pól
        Produkt produkt6 = new Produkt("PowerBank");
        produkt6.setOpis("PowerBank z fast charge 20000 mAh");
        produkt6.setCena(100.99);
        produkt6.setIlosc(9);
        produkt6.setWaga(0.4);
        produkt6.setDostepny(true);

        // Tworzenie kolejnych zmiennych i przypisanie wartości z innych zmiennych lub z pól obiektów
        double cenaProduktu1 = produkt1.getCena();
        String nazwaProduktu2 = produkt2.getNazwa();
        int iloscProduktu4 = produkt4.getIlosc();
        boolean dostepnoscProduktu6 = produkt6.isDostepny();
    }
}


