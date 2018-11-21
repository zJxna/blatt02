/******************************************************************************
 *  Compilation:  javac Gcd.java
 *  Execution:    java Gcd a b
 *  Test:         ./gradlew testen
 *
 *  Eingabe: Zwei nicht-negative, ganze Zahlen a und b.
 *  Ausgabe: Der groesste gemeinsame Teiler. Benutzen Sie den Euklidischen Algorithmus zur Berechnung.
 *
 *  Referenzen: https://de.wikipedia.org/wiki/Euklidischer_Algorithmus#Iterative_Variante
 *
 * Ueberpruefen Sie, dass die Eingaben nicht-negativ sind. Wenn mindestens eine Eingabe negativ ist,
 * soll das Programm ERROR ausgeben. Andere Fehleingaben koennen Sie ignorieren.
 * 
 ******************************************************************************/

public class Gcd {
    public static void main(String[] args) {
        // Implementieren Sie Ihre Loesung hier
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a < 0 || b < 0) {
            System.out.println("ERROR");
        } else {
            /* Im Kommentar ist der Pseudocode von Wikipedia (s. Referenzen) */
            int h = 0;
            while (b != 0) {       // 1  solange b != 0
                h = a % b;           // 2      h <-- a mod b
                a = b;               // 3      a <-- b
                b = h;               // 4      b <-- h
            }
            System.out.println(a); // 5  return a
        }
    }
}
