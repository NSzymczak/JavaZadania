package Lista3;

import java.util.Scanner;
public class Zadanie2
{
    public static void main(String[] args) {
        String slowo = "babbba";
        String podslowo = "abba";
        char[] slowoArray = slowo.toCharArray();
        char[] podslowoArray = podslowo.toCharArray();
        System.out.println(isPresent(podslowoArray, slowoArray));
    }

    public static boolean isPresent(char[] podslowo, char[] slowo)
    {
        for (int i = 0; i < slowo.length - podslowo.length+1; i++)
        {
            for (int j = 0; j < podslowo.length; j++) {
                if (slowo[i + j] == podslowo[j])
                {
                    if (j == podslowo.length - 1)
                    {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }
}

