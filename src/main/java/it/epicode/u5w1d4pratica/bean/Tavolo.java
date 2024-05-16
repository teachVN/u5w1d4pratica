package it.epicode.u5w1d4pratica.bean;

import it.epicode.u5w1d4pratica.enumeration.Stato;
import lombok.Data;

@Data
public class Tavolo {
    private int numero;
    private int maxCoperti;
    private Stato stato;
    private double coperto;

}
