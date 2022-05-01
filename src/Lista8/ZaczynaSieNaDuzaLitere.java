package Lista8;

public class ZaczynaSieNaDuzaLitere extends Exception
{
    String napis;

    ZaczynaSieNaDuzaLitere(String napis){
        this.napis=napis;
    }

    public String getMessage(){
        return "Imie/Nazwisko:"+napis+" musi zaczynać się na dużą literę";
    }
}
