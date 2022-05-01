package Lista8;

public class Domena extends Exception{
    String email;

    Domena(String email){
        this.email=email;
    }

    public String getMessage(){
        return "E-mail: "+email+" jest nieprawidłowy, ponieważ zawiera złą domene.";
    }

}