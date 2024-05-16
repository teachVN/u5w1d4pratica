package it.epicode.u5w1d4pratica.bean;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class VoceDiMenu {
    @Id
    @GeneratedValue
    private int id;
    private int calorie;
    private double prezzo;
}
