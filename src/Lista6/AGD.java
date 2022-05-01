package Lista6;

public class AGD extends Rzecz{
    //Artykuły Gospodastwa Domowego
    int głośność;
    String klasaGłośności;

    public AGD(){

    }

    public AGD(int głośność, String klasaGłośności) {
        this.głośność=głośność;
        this.klasaGłośności=klasaGłośności;
    }

    public AGD(String color, String wymiar, String struktura, double cena, int głośność, String klasaGłośności) {
        super(color, wymiar, struktura, cena);
        this.głośność=głośność;
        this.klasaGłośności=klasaGłośności;
    }
}
