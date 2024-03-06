package esercizio_1;

public class Rettangolo {
    //    ATTRIBUTES
    private int altezza;
    private int larghezza;

//    CONSTRUCTOR

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }


//    METHODS

    public static void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {
        System.out.println("area del primo rettangolo è: " + ret1.calcolaArea(ret1.altezza, ret1.larghezza) + ", il perimetro è :" + ret1.calcolaPerimetro(ret1.altezza, ret1.larghezza));
        System.out.println("area del secondo rettangolo è: " + ret2.calcolaArea(ret2.altezza, ret2.larghezza) + ", il perimetro è :" + ret2.calcolaPerimetro(ret2.altezza, ret2.larghezza));
        System.out.println("la somma delle due aree è: " + (ret1.calcolaArea(ret1.altezza, ret1.larghezza) + ret2.calcolaArea(ret2.altezza, ret2.larghezza)) + " la somma dei due perimetri è: " + (ret1.calcolaPerimetro(ret1.altezza, ret1.larghezza) + ret2.calcolaPerimetro(ret2.altezza, ret2.larghezza)));
    }

    public void stampaRettangolo() {
        System.out.println("l'area del rettangolo è: " + calcolaArea(altezza, larghezza) + ", il perimetro è :" + calcolaPerimetro(altezza, larghezza));
    }

    public int calcolaArea(int altezza, int larghezza) {
        return altezza * larghezza;
    }

    public int calcolaPerimetro(int altezza, int larghezza) {
        return (altezza + larghezza) * 2;
    }
}



