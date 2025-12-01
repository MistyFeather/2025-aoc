import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Day1.
 * 
 * @author Sara Schmid 
 * @version 01.12.2024
 */
public class Day1 extends aoc2025 {
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
    String inputFile = "input/d1i.txt";

    // Input mit "i" am Ende
    //String inputFile = "input/e";

    public Day1() throws Exception {
        // Lese die Eingabedatei
        this.readInput(inputFile);
        this.printInput();

        // Der Inhalt der Datei steht jetzt zeilenweise im 
        // Attribut inputLines
    }

    public int partOne() {
        int dial = 50;
        int pass = 0;
        for(String i:inputLines){
            if(i.charAt(0) == 'R') {
                i = i.replace("R","");
                dial += Integer.parseInt(i);
                if(dial > 99) {
                    dial = dial%100;
                }
            }
            else if(i.charAt(0) == 'L') {
                i = i.replace("L","");
                dial -= Integer.parseInt(i);
                if(dial < 0) {
                    dial = dial%100;
                }
            }
            if(dial == 0){
                pass += 1;
            }
        }
        return pass;
    }

    public int partTwo() {
        int dial = 50;
        int pass = 0;
        for(String i:inputLines){
            if(i.charAt(0) == 'R') {
                i = i.replace("R","");
                dial += Integer.parseInt(i);
            }
            else if(i.charAt(0) == 'L') {
                i = i.replace("L","");
                dial -= Integer.parseInt(i);
            }
            if(dial > 99){
                pass += dial/100;
            }
            if(dial < 0){
                pass += dial/-100;
                if((-dial) < Integer.parseInt(i)){
                    pass += 1;
                }
            }
            if(dial == 0){
                pass += 1;
            }
            dial = dial%100;
        }
        return pass;
    }

}
