package esercizio_2;

import java.util.Arrays;

public class Sim {

    private long numeroDiTelefono;
    private int credito;
    private Chiamata[] chiamate;

    public Sim(long numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.credito = 0;
        this.chiamate = new Chiamata[0];
    }

    public static void printData(Sim sim) {
        System.out.println(sim);
    }

    @Override
    public String toString() {
        return "Sim{" +
                "numeroDiTelefono=" + numeroDiTelefono +
                ", credito=" + credito +
                ", chiamate=" + Arrays.toString(chiamate) +
                '}';
    }

}

