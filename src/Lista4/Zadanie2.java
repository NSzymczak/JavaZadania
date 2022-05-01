package Lista4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zadanie2 {
    public static void main(String[] args){
        LocalDateTime date = LocalDateTime.now();
        System.out.println("Data przed formatowaniem: " + date);

        DateTimeFormatter firstFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd G 'at' HH:mm:ss");
        DateTimeFormatter secondFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter thirdFormat = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy HH:mm:ss");


        String formatedFirstDate = date.format(firstFormat);
        String formatedSecondDate = date.format(secondFormat);
        String formatedThirdDate = date.format(thirdFormat);

        System.out.println("Pierwsze formatowanie: " + formatedFirstDate);
        System.out.println("Drugie formatowanie: " + formatedSecondDate);
        System.out.println("Trzecie formatowanie: " + formatedThirdDate);
    }
}
