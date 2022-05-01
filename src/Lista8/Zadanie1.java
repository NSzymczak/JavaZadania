package Lista8;

import java.util.Scanner;

public class Zadanie1
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] num={"1","2","3!"};
        try
        {
            int n = Integer.parseInt(scanner.next());
            System.out.println(n/(n-1));
        }
        catch(NumberFormatException e) {
            System.err.println("Wybrany element tablicy nie jest liczbą");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Zly indeks");
        }
        catch(ArithmeticException e) {
            System.err.println("Nie wolno dzielić przez 0");
        }
    }
}