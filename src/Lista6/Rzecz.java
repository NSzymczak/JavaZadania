package Lista6;

abstract public class Rzecz
{
    String color;
    String wymiar;
    String struktura;
    double cena;

    public Rzecz(String color, String wymiar, String struktura, double cena) {
        this.color = color;
        this.wymiar = wymiar;
        this.struktura = struktura;
        this.cena = cena;
    }

    public Rzecz(){

    }
}