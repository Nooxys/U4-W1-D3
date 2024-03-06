package esercizio_3;

import java.util.Arrays;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] elencoArticoli;
    private int costoTotale;

    public Carrello(Cliente clienteAssociato, Articolo[] elencoArticoli) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = elencoArticoli;
        this.costoTotale = totaleCarrello(elencoArticoli);
    }

    public int totaleCarrello(Articolo[] elencoArticoli) {
        for (int i = 0; i < elencoArticoli.length; i++) {
            costoTotale += elencoArticoli[i].getPrezzo();

        }
        return costoTotale;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "clienteAssociato=" + clienteAssociato +
                ", elencoArticoli=" + Arrays.toString(elencoArticoli) +
                ", costoTotale=" + costoTotale +
                '}';
    }
}
