package Lista6;

public class RTV extends Rzecz{
    //Radio i Telewizja
    String standardyOdtwarzania;
    String zakresFal;

    public RTV(){

    }

    public RTV(String standardyOdtwarzania,String zakresFal){
        this.standardyOdtwarzania=standardyOdtwarzania;
        this.zakresFal=zakresFal;
    }

    public RTV(String color, String wymiar, String struktura, double cena, String standardyOdtwarzania) {
        super(color, wymiar, struktura, cena);
        this.standardyOdtwarzania=standardyOdtwarzania;
    }
}
