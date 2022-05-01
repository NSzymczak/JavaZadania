package Lista1;

public class Uczen {
    private String imie;
    public static int numerKursu; //jeden numer kursu odnosi się do wszystkich uczniów
    public final int rokRozpoczecia;
    private int ocena;
    private String ulKolor;

    //public Uczen(){}

    //public Uczen(String i)
    //{
    //    imie = i;
    //}

    public Uczen(String i, int o)
    {
        imie = i;
        ocena = o;
        this.rokRozpoczecia=2000;
    }

    public Uczen(String imie, int ocena, String ulKolor, int rokRozpoczecia)
    {
        setImie(imie);
        setOcena(ocena);
        setUlKolor(ulKolor);
        this.rokRozpoczecia = rokRozpoczecia;
    }

    public void setUlKolor(String k)
    {
        ulKolor=k;
    }
    public String getUlKolor()
    {
        return ulKolor;
    }
    public void setOcena(int o)
    {
        if(o<7 && o>0)
            ocena=o;
        else
            System.out.println("Nieprawidłowa ocena");
    }

    public int getOcena()
    {
        return ocena;
    }

    public void setImie(String i)
    {
        imie=i;
    }

    public String getImie()
    {
        return imie;
    }
}
