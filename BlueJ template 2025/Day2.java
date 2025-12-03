import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Day2.
 * 
 * @author Sara Schmid 
 * @version 01.12.2024
 */
public class Day2 extends aoc2025 {
    // Eingabedatei (kann man hier ändern, weil das Eingeben 
    // der passenden Datei bei jeder Instanziierung über einen 
    // Parameterlästig ist)
    // Vorschlag für die Benennung d<Tagesnummer>[e|i] 
    // e: Example für die Beispieldaten
    // i: Input für die Rätseleingabe
    // Das ganze am besten im Unterverzeichnis "input",
    // damit die Eingabedateien nicht das ganze Verzeichnis 
    // vermüllen.

    // Beispiel mit "e" am Ende
    String inputFile = "input/d2i.txt";

    // Input mit "i" am Ende
    //String inputFile = "input/e";

    public Day2() throws Exception {
        // Lese die Eingabedatei
        this.readInput(inputFile);

        // Der Inhalt der Datei steht jetzt zeilenweise im 
        // Attribut inputLines

        // Kontrollausgabe
        this.printInput();
    }

    public long partOne() {
        long invID = 0;
        for(String line: inputLines) {
            String[] ranges = line.split(",");
            for(String crange: ranges) {
                String[] boundaries = crange.split("-");
                long start = Long.parseLong(boundaries[0]);
                long end = Long.parseLong(boundaries[1]);
                for(long i = start; i <= end; i++) {
                    String c = ""+i;
                    String p1 = c.substring(0,c.length()/2);
                    String p2 = c.substring(c.length()/2,c.length());
                    if(p1.equals(p2)) {
                        invID += i;
                    }
                }
            }
        }
        System.out.println(invID);
        return invID;
    }

    public int partTwo() {
        for(String zeile: inputLines) {
            // ArrayList<Character> zahlen = new ArrayList<>();

        }

        return 0;
    }

}
