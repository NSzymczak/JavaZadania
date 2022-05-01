package Lista2;

import java.util.Scanner;

public class Zadanie1 {
    public static String licz(int minuty){
        String wynik=" ";
        int dni=0;
        int godziny=0;
        if(minuty >= 0){
            dni = minuty/480;
            godziny = (minuty-(dni*480))/60;
            minuty = minuty - (dni*480) - (godziny*60);
            wynik+="Liczba dni: "+dni + " Liczba godzin: " + godziny + " Liczba minut: " + minuty;
        }
        return wynik;
    }



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj ilość minut: ");
        int minuty= scan.nextInt();

        System.out.println("Wynik: "+licz(minuty));
    }
}