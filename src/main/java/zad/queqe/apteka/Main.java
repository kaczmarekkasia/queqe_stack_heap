package zad.queqe.apteka;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer(25, false, "Ania");
        Customer c2 = new Customer(80, false, "Marek");
        Customer c3 = new Customer(25, true, "Ania");
        Customer c4 = new Customer(70, false, "Olaf");
        Customer c5 = new Customer(35, true, "Magda");


        Apteka apteka1 = new Apteka ();
        apteka1.dodajDoKolejki(c1, c2, c3, c4, c5);

        apteka1.wypisz();


    }
}
