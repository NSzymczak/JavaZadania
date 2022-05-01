package Lista3;

import java.util.Scanner;

public class Zadanie5
{
    public static boolean czyInteger(String s){
        try {
            Integer.parseInt(s);
        }
        catch(NumberFormatException e) {
            return false;
        }
        catch(NullPointerException e) {
            return false;
        }
        return true;
    }

    static public boolean czyPesel(String napis){
        String dzielenie="1379";
        int suma=0,l1,l2;
        int liczba[]=new int[10];
        for (int j = 0; j < 10; j++)
        {
            l1 = napis.charAt(j) - 48; //dlaczego 48
            l2 = dzielenie.charAt(j % 4) - 48;

            liczba[j]=l1*l2;
            if(liczba[j]>10)
            {
                liczba[j]=liczba[j]%10;
            }
            suma+=liczba[j];
        }
        suma=suma%10;
        suma=10-suma;
        if(napis.charAt(10)-48==suma)
        {return true;}
        else
        {return false;}
    }

    static public boolean czyData(String napis){
        String[] oddzielone =napis.split("\\.");
        for (String x:oddzielone)
        {
            if(!czyInteger(x)){
                return false;
            }
        }
        if(oddzielone.length==3) return true;
        else return false;
    }

    static public boolean czyjednoImie(String napis){

        String[] oddzielone =napis.split(" ");
        if(oddzielone.length==2) return true;
        else return false;
    }

    static public boolean czydwaImie(String napis){

        String[] oddzielone =napis.split(" ");
        if(oddzielone.length==3) return true;
        else return false;
    }

    static public void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String napis = scan.nextLine();
        if(napis.length() <= 3 && czyInteger(napis))
        {
            wypisz(Integer.parseInt(napis));
        }
        else if(czyData(napis))
        {
            String[] oddzielone =napis.split("\\.");
            wypisz(Integer.parseInt(oddzielone[0]),Integer.parseInt(oddzielone[1]),Integer.parseInt(oddzielone[2]));
        }
        else if(czyjednoImie(napis))
        {
            String[] oddzielone =napis.split(" ");
            wypisz(oddzielone[0],oddzielone[1]);
        }
        else if(czydwaImie(napis))
        {
            String[] oddzielone =napis.split(" ");
            wypisz(oddzielone[0],oddzielone[1],oddzielone[3]);
        }
        else if(napis.length()==11 && czyPesel(napis))
        {
            wypisz(napis);
        }
        else
        {
            System.out.println("Podałeś nieprawidłowe dane");
        }

    }

    public static void wypisz(int wiek){
        System.out.println("Masz "+wiek+" lat");
        System.out.println("Urodziłeś się w "+(2022-wiek));
    }

    public static void wypisz(int dzien, int miesiac, int rok){
        System.out.print("Urodziłeś się "+dzien);
        switch(miesiac) {
            case 1:
                System.out.print(" stycznia ");
                break;
            case 2:
                System.out.print(" lutego ");
                break;
            case 3:
                System.out.print(" marca ");
                break;
            case 4:
                System.out.print(" kwietnia ");
                break;
            case 5:
                System.out.print(" maja ");
                break;
            case 6:
                System.out.print(" czerwca ");
                break;
            case 7:
                System.out.print(" lipca ");
                break;
            case 8:
                System.out.print(" sierpnia ");
                break;
            case 9:
                System.out.print(" września ");
                break;
            case 10:
                System.out.print(" października ");
                break;
            case 11:
                System.out.print(" listopada ");
                break;
            case 12:
                System.out.print(" grudnia ");
                break;
        }
        System.out.println(" "+rok+" roku");
    }

    public static void wypisz(String pesel){  //RR MM DD LLL P K
        int rok = Integer.parseInt((pesel.substring(0, 2)));
        int miesiac = Integer.parseInt((pesel.substring(2, 4)));
        int dzien = Integer.parseInt((pesel.substring(4, 6)));
        int plec = (pesel.charAt(9) - 48) % 2;
        if (80 < miesiac && miesiac < 93) {
            miesiac = miesiac - 80;
            rok = 1800 + rok;
        }
        if (0 < miesiac && miesiac < 13) {
            rok = 1900 + rok;
        }
        if (20 < miesiac && miesiac < 33) {
            miesiac = miesiac - 20;
            rok = 2000 + rok;
        }
        if (40 < miesiac && miesiac < 53) {
            miesiac = miesiac - 40;
            rok = 2100 + rok;
        }
        if (60 < miesiac && miesiac < 73) {
            miesiac = miesiac - 60;
            rok = 2200 + rok;
        }
        System.out.println(rok + " " + miesiac + " " + dzien);
        switch (plec)
        {
            case 0:
                System.out.println("Kobieta");
                break;
            case 1:
                System.out.println("Mężczyzna");
                break;
        }
    }

    public static void wypisz(String imie, String nazwisko){

        System.out.println("Nazywasz się "+imie+" "+nazwisko);
    }

    public static void wypisz(String imie1, String imie2, String nazwisko){
        System.out.println("Nazywasz się "+imie1+" "+imie2+" "+nazwisko);
    }
}
