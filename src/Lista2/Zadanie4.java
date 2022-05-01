package Lista2;

import java.util.Scanner;

public class Zadanie4 {

    static class Data
    {
        int d, m, y;

        public Data(int d, int m, int y)
        {
            this.d = d;
            this.m = m;
            this.y = y;
        }
    }

    static int dniMiesiaca[] = {31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31};

    static int dniMiesiacalepiej[] = {31, 59, 90, 120, 151, 181,
            212, 243, 273, 304, 334, 365};

    static int IlePrzestepnych(Data d)
    {
        int years = d.y;
        if (d.m <= 2)
        {
            years--;
        }
        return (years / 4) - (years / 100) + (years / 400);
    }

    static int LiczDni(Data data1)
    {
        int dni = data1.y * 365 + data1.d;
        for (int i = 0; i < data1.m - 1; i++)
        {
            dni += dniMiesiaca[i];
        }
        //dni+=dniMiesiacalepiej[data1.m-1];
        dni += IlePrzestepnych(data1);

        return dni;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dzień- miesiac-rok daty początkowej");
        int dzienP=scan.nextInt();
        int miesiacP=scan.nextInt();
        int rokP=scan.nextInt();

        System.out.println("Podaj dzień- miesiac-rok daty końcowej");
        int dzienK=scan.nextInt();
        int miesiacK=scan.nextInt();
        int rokK=scan.nextInt();

        Data dt1 = new Data(dzienP, miesiacP, rokP);
        Data dt2 = new Data(dzienK, miesiacK, rokK);
        System.out.println("Ilosc dni pomiedzy datami " + (LiczDni(dt2)-LiczDni(dt1)));
    }
}

