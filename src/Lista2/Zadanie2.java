package Lista2;

import java.util.Scanner;

public class Zadanie2 {

    public static String  procenty(int ocena){
        String wynik = "";
        if (ocena <= 50 && ocena > 0)
            wynik = "niedostateczny";
        if (ocena > 50 && ocena <= 60)
            wynik = "dostateczny";
        if (ocena > 60 && ocena <= 70)
            wynik = "dostateczny plus";
        if (ocena > 70 && ocena <= 80)
            wynik = "dobry";
        if (ocena > 80 && ocena <= 90)
            wynik = "bardzo dobry";
        if (ocena > 90 && ocena <= 100);
        return wynik;
    }

    public static int dodawanie(int x, int y){
        int wynik=0;
        wynik = x+y;
        return wynik;
    }

    public static int odejmowanie(int x,int y){
        int wynik=0;
        wynik=x-y;
        return wynik;
    }

    public static int mnozenie(int x,int y){
        int wynik=0;
        wynik = x*y;
        return wynik;
    }

    public static int dzielenie(int x,int y){
        int wynik=0;
        wynik = x/y;
        return wynik;
    }
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int x = scan.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        int y = scan.nextInt();

        System.out.println("Jakie Działanie chcesz wykonać?");
        System.out.println("Dodawanie - wybierz 1");
        System.out.println("Odejmowanie - wybierz 2");
        System.out.println("Mnożenie - wybierz 3");
        System.out.println("Dzielenie - wybierz 4");
        System.out.println("Oblicz ocenę - wybierz 5");

        int wybor = scan.nextInt();

        switch(wybor){
            case 1:
                System.out.println(dodawanie(x, y));
                break;
            case 2:
                System.out.println(odejmowanie(x,y));
                break;
            case 3:
                System.out.println(mnozenie(x,y));
                break;
            case 4:
                System.out.println(dzielenie(x,y));
                break;
            case 5:
                System.out.println("Podaj wynik procentowy z egzaminu: ");
                int ocena = scan.nextInt();
                System.out.println(procenty(ocena));
                break;
        }

    }
}
