package Lista8;

public class NieLitery extends Exception
{
    String napis;
    NieLitery(String napis){
        this.napis=napis;
    }
    public String getMessage(){
        return "Imie/ Nazwisko: "+napis+" musi zawierać składać się z samych liter";
    }
}
