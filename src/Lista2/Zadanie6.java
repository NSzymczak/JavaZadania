package Lista2;

public class Zadanie6 {
    public static void main(String[] args){
        int a = 60; // 60 = 0011 1100
        int b = 13; //13 = 0000 1101
        int c = 0;

        // AND
        c = a & b;        // 12 = 0000 1100
        System.out.println("a & b = " + c );

        // Przesunięcie w lewo
        c = a << 2;       // 240 = 1111 0000
        System.out.println("a << 2 = " + c );

        // Przesunięcie w prawo
        c = a >> 2;       // 15 = 1111
        System.out.println("a >> 2  = " + c );

    }
}
