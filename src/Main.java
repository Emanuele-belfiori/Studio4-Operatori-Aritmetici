public class Main {
    public static void main(String[] args) {
        System.out.println("Operatori Aritmetici: ");

        /*
         * Operazioni Aritmetiche:
         *
         * - Operatori aritmetici = + - / * %
         *
         * - Shorthand
         *
         * - Incremento e decremento
         *
         * - Esempi di espressioni
         */

        /*---------------------------Operatori aritmetici = + - / * %--------------------------------------*/

        int a = 10;
        int b = 2;
        int c = a + b -b * a / b; // Operazioni basilari operatori: + - / *
        System.out.println(c); // Stampa risultato
        int d = 10;
        int e = 3;
        int f = d % e; // Operatore modulo: il resto della divisione 10/3 = 3 con resto 1
        System.out.println(f); // Stampo risultato

// Come trovare un numero pari possiamo usare il modulo se da resto 0 è pari - resto 1 è dispari

        /*-----------------------------------------Shorthand---------------------------------------------*/

        int g = 10;
        //g = g + 3; --> Incremento della stessa variabile +3
        g += 3; // Questo è una shorthand (scorciatoia versione semplificata della variabile sopra)
        System.out.println(g);

        /*----------------------------------Incremento e Decremento---------------------------------------*/

        int h =10;
        h++; // Serve ad incrementare la variabile di 1
        h++;
        h++;
        System.out.println(h); // In stampa avremo 13

        // Il decremento si farà invece:
        // h--;
        // h--;
        // System.out.println(); --> A stampa in questo caso avremo come risultato 8

        /*---------------------------------------Espressioni----------------------------------------------*/

        int i = 11;
        int l = 3;
        int m = 9;
        int risultato = ((l + i) * l + (4 - 2)) * m;
        System.out.println(risultato);
    }
}