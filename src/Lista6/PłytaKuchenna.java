package Lista6;

public class PłytaKuchenna extends AGD{
    int polaGrzewcze;
    String rodzajSterowania;

    public PłytaKuchenna(int polaGrzewcze, String rodzajSterowania) {
        this.polaGrzewcze = polaGrzewcze;
        this.rodzajSterowania = rodzajSterowania;
    }

    public PłytaKuchenna(int polaGrzewcze, String rodzajSterowania, String color, String wymiar,
                         String struktura, double cena, int głośność, String klasaGłośności)
    {
        super(color, wymiar, struktura, cena,głośność, klasaGłośności);
        this.polaGrzewcze = polaGrzewcze;
        this.rodzajSterowania = rodzajSterowania;
    }
}
