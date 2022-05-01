package Lista4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Zadanie3 {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą datę w formacie dd/MM/yyyy: ");
        String userDate1 = scan.nextLine();
        System.out.println("Podaj drugą datę w formacie dd/MM/yyyy: ");
        String userDate2 = scan.nextLine();
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(userDate1);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(userDate2);

        long daysBeetween = date2.getTime() - date1.getTime();
        System.out.println("Dni pomiędzy: " + TimeUnit.MILLISECONDS.toDays(daysBeetween));
    }
}
