package zad.queqe.apteka;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Apteka {

    private PriorityQueue<Customer> kolejka=new PriorityQueue<>(new CopmaratorCustomer());

    public void wypisz() {
        while (!kolejka.isEmpty()) {
            // wywołujemy do "pokazania się" pierwszy element. bez tego warunku, poza piewrszym elementem pozstałe pokaże bez sortowania
            System.out.println(kolejka.poll());
        }
    }

    PriorityQueue<Customer> dodajDoKolejki (Customer...customers){
        //koniecznie trzeba zapisać Arrays.asList
        kolejka.addAll(Arrays.asList(customers));
        return kolejka;
    }
}
