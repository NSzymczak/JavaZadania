package Lista3;

import java.util.Scanner;



public class Zadanie4 {

    static public void rokUrodzenia (String napis)
    {
        System.out.println("Twoja liczba to wiek.");
        int rok = 0;
        rok = 2022 - Integer.valueOf(napis);
        System.out.println(rok);
    }
    static public void peselinfo(String napis)
    {
        String dzielenie="1379";
        int suma=0,l1,l2;
        int liczba[]=new int[10];
        for (int j = 0; j < 10; j++)
        {
            l1=napis.charAt(j)-48; //dlaczego 48
            l2=dzielenie.charAt(j%4)-48;
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
        {
            int rok = Integer.parseInt((napis.substring(0, 2)));
            int miesiac = Integer.parseInt((napis.substring(2, 4)));
            int dzien = Integer.parseInt((napis.substring(4, 6)));
            int plec = (napis.charAt(9) - 48) % 2;
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
            switch (plec) {
                case 0:
                    System.out.println("Kobieta");
                    break;
                case 1:
                    System.out.println("Mężczyzna");
                    break;
            }
        }
        else
        {
            System.out.println("Pesel niepoprawny");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        String napis=scan.nextLine();
        int y = napis.length();
        if(y == 11)
        {
            peselinfo(napis);
        }

        if(y <= 3)
        {
            rokUrodzenia(napis);
        }
    }
}