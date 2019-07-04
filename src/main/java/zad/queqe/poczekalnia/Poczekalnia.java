package zad.queqe.poczekalnia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.PriorityQueue;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Poczekalnia {
    private PriorityQueue<Klient> kolejka = new PriorityQueue<>(new Comparator<Klient>(){
        @Override
        public int compare(Klient k1, Klient k2) {
            if (k1.isCzyPriorytet() && !k2.isCzyPriorytet()) {
                return -1;
            }
            if (k2.isCzyPriorytet() && !k1.isCzyPriorytet()) {
                return 1;
            }
            if (k1.getCzasPrzybycia().isAfter(k2.getCzasPrzybycia())) {
                return 1;
            }
            if (k2.getCzasPrzybycia().isAfter(k1.getCzasPrzybycia())) {
                return -1;
            }
            return 0;
        }
    });


        public void dodajKlienta(Klient k) {
            //synonim .add
        kolejka.offer(k);

    }

        public Klient pobierzKlienta() {
            Klient k = kolejka.poll();
            if (k == null) {
                throw new KolejkaJestPustaException(":(");
            }
            return k;
        }

        public void wypisz() {
            //tworzymy nową kolejkę, bo wypisanie "wyciąga z niej klientów, a nie chcemy żeby została pusta
            PriorityQueue<Klient> tymczasowaKolejka = new PriorityQueue<>(kolejka);

            while (!tymczasowaKolejka.isEmpty()){
                System.out.println(tymczasowaKolejka.poll());
            }
        }

    }

