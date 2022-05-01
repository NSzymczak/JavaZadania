package Lista2;

import java.util.Scanner;

public class Zadanie7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe w której chcesz zamienic trzeci bit");
        int x=scan.nextInt();
        x=x^4;
        System.out.println(x);
    }
}