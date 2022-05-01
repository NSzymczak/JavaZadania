package Lista6;

public interface Poruszanie {
    public Boolean Start(Boolean powerOn);
    public Boolean Stop(Boolean colision, Boolean powerOff);
    void PrzebytaOdelglosc(float odleglosc);
}
