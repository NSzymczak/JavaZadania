package Lista1;

import java.util.Scanner;

public class Nauczyciel
{
    public static void main(String[] args)
    {
        //Uczen uczen1 = new Uczen();
        //Uczen uczen2 = new Uczen();

        //uczen1.setImie("Ela");
        //uczen1.numerKursu=2;
        //uczen1.setOcena(5);

        //uczen2.setImie("Ala");
        //uczen2.numerKursu=1;
        //uczen2.setOcena(4);

        //System.out.println(uczen1.getImie());
        //System.out.println(uczen1.numerKursu);
        //System.out.println(uczen1.rokRozpoczecia);
        //System.out.println(uczen1.getOcena());

        //System.out.println(uczen2.getImie());
        //System.out.println(uczen2.numerKursu);
        //System.out.println(uczen2.rokRozpoczecia);
        //System.out.println(uczen2.getOcena());

        Scanner scan = new Scanner(System.in);
        String imie, kolor;
        int ocena, rok;
        System.out.println("Podaj imie ucznia");
        imie=scan.next();
        System.out.println("Podaj ulubiony kolor");
        kolor=scan.next();
        System.out.println("Podaj rok rozpoczecia");
        rok=scan.nextInt();
        System.out.println("Podaj ocene");
        ocena=scan.nextInt();
        Uczen nowyUczen = new Uczen(imie,ocena,kolor,rok);
        nowyUczen.numerKursu = 2;


        System.out.println("Podaj dane kolejnego ucznia");
        System.out.println("Podaj imie ucznia");
        imie=scan.next();
        System.out.println("Podaj ulubiony kolor");
        kolor=scan.next();
        System.out.println("Podaj rok rozpoczecia");
        rok=scan.nextInt();
        System.out.println("Podaj ocene");
        ocena=scan.nextInt();
        Uczen nowyUczen2 = new Uczen(imie,ocena,kolor,rok);
        nowyUczen2.numerKursu = 5;

        //nowyUczen2.rokRozpoczecia=2001;
        nowyUczen2.setOcena(2);

        System.out.println("Wprowadziłeś następujące dane o pierwszym uczniu: ");
        System.out.println("Imię: "+nowyUczen.getImie());
        System.out.println("Ulubiony kolor: " + nowyUczen.getUlKolor());
        System.out.println("Numer kursu: " + nowyUczen.numerKursu);
        System.out.println("Rok rozpoczęcia: " + nowyUczen.rokRozpoczecia);
        System.out.println("Ocena: " + nowyUczen.getOcena());
        System.out.println("Wprowadziłeś następujące dane o drugim uczniu: ");
        System.out.println("Imię: "+nowyUczen2.getImie());
        System.out.println("Ulubiony kolor: " + nowyUczen2.getUlKolor());
        System.out.println("Numer kursu: " + nowyUczen2.numerKursu);
        System.out.println("Rok rozpoczęcia: " + nowyUczen2.rokRozpoczecia);
        System.out.println("Ocena: " + nowyUczen2.getOcena());
    }
}
