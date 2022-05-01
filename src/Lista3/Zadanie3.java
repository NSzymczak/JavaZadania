package Lista3;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj zdanie: ");
        String zdanie = scan.nextLine();
        String[] wyrazy = zdanie.split(" ");
        System.out.println(wyrazy.length);
    }
}
