package Lista5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Zadanie3
{
    public static List<Date> listDate = new ArrayList<Date>();
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Podaj datę w formacie dd.mm.yyyy: ");
            String userDate1 = scan.nextLine();
            Date date1 = new SimpleDateFormat("dd.MM.yyyy").parse(userDate1);
            if (Exists(date1)) {
                System.out.println("Na liście znajduję się już podana data.");
            }
            else {
                if(listDate.isEmpty())
                {
                    listDate.add(date1);
                }
                else
                {
                    if (listDate.size() >= 4)
                    {
                        listDate.remove(0); //usuwamy najstarszą datę
                    }
                    AddAndSort(date1);
                    Write();
                }

            }
        }while(true);
    }
    public static Boolean Exists(Date date1){
        for(int i=0;i<listDate.size();i++){

            if(date1.equals(listDate.get(i)))
            {
                return true;
            };
        }
        return false;
    }
    public static void AddDate(Date date1) {
        listDate.add(date1);
        listDate.sort(Comparator.naturalOrder());
    }
    public static void Write(){
        System.out.println(listDate);
    }
    public static void AddAndSort(Date data){
        int i=0;
        while(i< listDate.size() && !data.before(listDate.get(i)))
        {
            i++;
        }
        listDate.add(i,data);
    }
}
