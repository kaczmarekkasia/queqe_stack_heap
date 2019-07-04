package zad.queqe.poczekalnia;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor


public class Klient {
    private String imie;
    private LocalDateTime czasPrzybycia = LocalDateTime.now();
    private boolean czyPriorytet;

    public Klient(String imie, boolean czyPriorytet) {
        this.imie = imie;
        this.czyPriorytet = czyPriorytet;
    }
}
