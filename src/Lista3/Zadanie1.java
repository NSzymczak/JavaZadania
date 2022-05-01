package Lista3;

import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko");
        String imieNazwisko=scan.nextLine();
        String[] oddzielone =imieNazwisko.split(" ");
        for (String x:oddzielone)
        {
            System.out.println(x);
        }
    }
}

