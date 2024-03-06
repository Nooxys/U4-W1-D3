import esercizio_1.Rettangolo;
import esercizio_2.Sim;
import esercizio_3.Articolo;
import esercizio_3.Carrello;
import esercizio_3.Cliente;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // ESERCIZIO 1 ---------------


        Rettangolo rettangolo1 = new Rettangolo(5, 10);
        Rettangolo rettangolo2 = new Rettangolo(15, 30);
        rettangolo1.stampaRettangolo();

        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);


        //ESERCIZIO 2 ----------------


        Sim ciro = new Sim(340300);
        Sim.printData(ciro);


        //ESERCIZIO 3 -----------------

        Cliente topogigio = new Cliente(8, "topo gigio", "topogigio@gmail.com", "05-05-2024");
        Articolo formaggio = new Articolo(50, "molto buono!", 30, 5);
        Articolo altroFormaggio = new Articolo(45, "sublime!", 99, 1);
        Articolo[] articolos = {formaggio, altroFormaggio};
        Carrello cart = new Carrello(topogigio, articolos);
        System.out.println(topogigio);
        System.out.println(Arrays.toString(articolos));
        System.out.println(cart);
    }
}