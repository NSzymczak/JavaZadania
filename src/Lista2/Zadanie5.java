package Lista2;

public class Zadanie5 {
    public static void main(String[] args){
        int x = 0;
        if (false & (1 == ++x)) {
            //środek if
        }
        System.out.println("Pojedynczy &");
        System.out.println(x);

        int y = 0;
        if (false && (1 == ++y)) {
            //środek if
        }
        System.out.println("Podwójny &&");
        System.out.println(y);
    }
}
