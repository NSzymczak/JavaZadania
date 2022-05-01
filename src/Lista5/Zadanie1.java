package Lista5;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int n= scan.nextInt();
        String[][] tabliczka = new String[n+1][n+1];
        //a11 a12 a13
        //a21 a22 a23
        //a31 a32 a33
        for (int i=n; i>0; i--) // zaczynamy od najwiekszych
        {
            for (int j=n; j>0; j--) //najpierw wypełniamy wiersze
            {
                tabliczka[i][j]= String.valueOf(i*j);

                while(tabliczka[i][j].length()<tabliczka[n][j].length())
                {
                    tabliczka[i][j]=" "+tabliczka[i][j];
                }
            }
        }
        //Tworzenie górnej ramki
        for (int j=1; j<=n; j++)
        {
            tabliczka[0][j]=tabliczka[1][j];
        }
        //Tworzenie pustego miejsca
        tabliczka[0][0]=" ";
        while(tabliczka[0][0].length()<tabliczka[n][1].length())
        {
            tabliczka[0][0]=" "+tabliczka[0][0];
        }
        //Tworzenie lewej ramki
        for (int i=1; i<=n; i++)
        {
            tabliczka[i][0]=tabliczka[i][1];
        }
        //Wypisanie efektu końcowego
        for (int i=0; i<=n; i++)
        {
            for (int j=0; j<=n; j++)
            {
                System.out.print(" "+tabliczka[i][j]);
            }
            System.out.println();
        }
    }
}
