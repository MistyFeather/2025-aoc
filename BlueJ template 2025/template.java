import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse template.
 * 
 * @author Sara Schmid 
 * @version 01.12.2024
 */
public class template extends aoc2025 {
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
    String inputFile = "input/example.txt";

    // Input mit "i" am Ende
    //String inputFile = "input/e";

    public template() throws Exception {
        // Lese die Eingabedatei
        this.readInput(inputFile);

        // Der Inhalt der Datei steht jetzt zeilenweise im 
        // Attribut inputLines

        // Kontrollausgabe
        this.printInput();
    }

    public int partOne() {
        
        return 0;
    }

    public int partTwo() {
        for(String zeile: inputLines) {
            // ArrayList<Character> zahlen = new ArrayList<>();
            
        }

        return 0;
    }

}
