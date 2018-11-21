/******************************************************************************
 *  Compilation:  javac Schachbrett.java
 *  Execution:    java Schachbrett n
 *  Test:         ./gradlew testen
 *
 *  Eingabe: Eine positive, ganze Zahl n.
 *  Ausgabe: Ein Schachbrett der Groesse n * n. Schwarze Felder werden durch einen
 *  Stern '*', weisse Felder durch ein Leerzeichen ' ' dargestellt. Das Brett
 *  beginnt mit einem schwarzen Feld.
 *
 * Ueberpruefen Sie, dass die Eingabe positiv ist. Wenn die Eingabe nicht positiv ist,
 * soll das Programm ERROR ausgeben. Andere Fehleingaben koennen Sie ignorieren.
 * 
 ******************************************************************************/

public class Schachbrett {
    public static void main(String[] args) {
        // Implementieren Sie Ihre Loesung hier 
        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("ERROR");
        } else {
            for (int zeile = 0; zeile < n; zeile++) {
                for (int spalte = 0; spalte < n; spalte++) {
                    if ((spalte + zeile) % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}