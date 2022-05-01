package Lista4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;

public class Zadanie4{
    public static void main(String[] args) throws ParseException {
        TimeZone timeZone1 =TimeZone.getTimeZone("Europe/Moscow");
        TimeZone timeZone2 = TimeZone.getTimeZone("Europe/Warsaw");
        WypiszTimeZoneUTC(timeZone1,timeZone2);
        String data ="01-01-2022";
        Date date= new SimpleDateFormat("dd-MM-yyyy").parse(data);
        System.out.println(Math.abs(timeZone(date, timeZone1)- timeZone(date, timeZone2))+" ");
    }

    public static void WypiszTimeZoneUTC(TimeZone timeZone1, TimeZone timeZone2)
    {
        System.out.println(timeZone1.getID()+" "+ TimeUnit.MILLISECONDS.toHours(timeZone1.getRawOffset())+" UTC");
        System.out.println(timeZone2.getID()+" "+ TimeUnit.MILLISECONDS.toHours(timeZone2.getRawOffset())+" UTC");
    }

    public static long timeZone(Date date, TimeZone timeZone) {
        long millis = timeZone.getRawOffset() + (timeZone.inDaylightTime(date) ? timeZone.getDSTSavings() : 0);
        return TimeUnit.MILLISECONDS.toHours(millis);
    }
}