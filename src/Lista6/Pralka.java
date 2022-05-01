package Lista6;

public class Pralka extends AGD{
    int pojemnosc;
    int iloscObrotow;

    public Pralka(int pojemnosc, int iloscObrotow) {
        this.pojemnosc = pojemnosc;
        this.iloscObrotow = iloscObrotow;
    }

    public Pralka(int pojemnosc, int iloscObrotow,int głośność, String klasaGłośności) {
        super(głośność,klasaGłośności);
        this.pojemnosc = pojemnosc;
        this.iloscObrotow = iloscObrotow;
    }
}