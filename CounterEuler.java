/******************************************************************************
 *  Compilation:  javac CounterEuler.java
 *  Execution:    java CounterEuler
 *  Test:         ./gradlew testen
 *
 *  Eingabe: -
 *  Ausgabe: positive, ganze Zahlen a,b,c,d,e, die die Eulersche Vermutung widerlegen.
 *
 *  Verwenden Sie fuenf ineinandergeschachtelte Schleifen um die Loesung zu finden. 
 *  Es genuegt nicht, den Testfall zu erfuellen indem Sie das Ergebnis ausgeben. 
 *
 *  Sie koennen als Obergrenze fuer alle Werte 200 verwenden.
 *
 *  Tipps:
 *  1) Sie koennen die Suche nach Loesungen dramatisch beschleunigen, indem
 *  Sie die Tatsache verwenden, dass die Loesungen symmetrisch sind. Angenommen
 *  Sie pruefen gerade Loesungen mit a = 15. Dann brauchen Sie fuer b keine Werte
 *  zu pruefen, die kleiner sind als 15. Gaebe es eine Loesung, haetten Sie diese
 *  bereits gefunden.
 *  2) Wenn Sie eine Loesung gefunden haben, koennen Sie aufhoeren zu suchen.
 *
 *  Bei Verwendung dieser Tipps findet man die Loesung in wenigen Sekunden, ohne
 *  Tipp 1 benoetigt man einige Minuten.
 *
 * 
 ******************************************************************************/

public class CounterEuler {
    public static void main(String[] args) {
        // Implementieren Sie Ihre Loesung hier
        boolean suche = true;
        int MAX = 200;
        for (long a = 1; a < MAX && suche; a++) {
            for (long b = a; b < MAX && suche; b++) {
                for (long c = b; c < MAX && suche; c++) {
                    for (long d = c; d < MAX && suche; d++) {
                        for (long e = d; e < MAX && suche; e++) {
                            long a5 = a * a * a * a * a;
                            long b5 = b * b * b * b * b;
                            long c5 = c * c * c * c * c;
                            long d5 = d * d * d * d * d;
                            long e5 = e * e * e * e * e;
                            if (a5 + b5 + c5 + d5 == e5) {
                                System.out.println(a + "," + b + "," + c + "," + d + "," + e);
                                suche = false;
                            }
                        }
                    }
                }
            }
        }
    }
}