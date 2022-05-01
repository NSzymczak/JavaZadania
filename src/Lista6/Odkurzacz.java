package Lista6;

public class Odkurzacz extends AGD implements Poruszanie{
    Boolean worki;
    int zasiegPracy;
    int pojemnosc;

    public Odkurzacz(Boolean worki, int zasiegPracy, int pojemnosc)
    {
        this.worki = worki;
        this.zasiegPracy = zasiegPracy;
        this.pojemnosc = pojemnosc;
    }

    public Odkurzacz(int zasiegPracy, Boolean worki, int pojemnosc, int głośność, String klasaGłośności)
    {
        super(głośność,klasaGłośności);
        this.zasiegPracy=zasiegPracy;
        this.worki=worki;
        this.pojemnosc=pojemnosc;
    }

    @Override
    public Boolean Start(Boolean powerOnClick){
        if(powerOnClick){
            return true;
        }
        return false;
    }

    @Override
    public Boolean Stop(Boolean collision, Boolean powerOffClick){
        if(collision){
            return true;
        }
        if(powerOffClick)
        {
            return true;
        }
        return false;
    }

    @Override
    public void PrzebytaOdelglosc(float odleglosc) {
        odleglosc+=1;
    }
}

