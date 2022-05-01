package Lista4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Zadanie1 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj datę w formacie dd/mm/yyyy: ");
        String userDate = scan.nextLine();
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(userDate);
        System.out.println("Podałeś: "+date);
    }
}
