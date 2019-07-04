package zad.queqe.poczekalnia;


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Poczekalnia poczekalnia = new Poczekalnia();

            Scanner scanner = new Scanner(System.in);

            boolean isWorking = true;
            do {
                String linia = scanner.nextLine();

                if (linia.equalsIgnoreCase("dodaj")) {
                    System.out.println("Podaj imie klienta:");
                    String imie = scanner.nextLine();
                    System.out.println("Czy ma priorytet?");
                    String czyPriorytet = scanner.nextLine();

                    boolean priorytet = czyPriorytet.equalsIgnoreCase("t") || czyPriorytet.equalsIgnoreCase("tak") || czyPriorytet.equalsIgnoreCase("yes") || czyPriorytet.equalsIgnoreCase("y");

                poczekalnia.dodajKlienta(new Klient(imie, priorytet));
                } else if (linia.equalsIgnoreCase("pobierz")) {
                Klient k = poczekalnia.pobierzKlienta();
                System.out.println(k);
                } else if (linia.equalsIgnoreCase("wypisz")) {
                poczekalnia.wypisz();
                }else if(linia.equalsIgnoreCase("quit")){
                    break;
                }

            } while (isWorking);

        }
    }


