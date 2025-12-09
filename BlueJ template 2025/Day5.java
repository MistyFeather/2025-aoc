import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Day5.
 * 
 * @author Sara Schmid 
 * @version 01.12.2024
 */
public class Day5 extends aoc2025 {
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
    String inputFile = "input/d5i.txt";

    // Input mit "i" am Ende
    //String inputFile = "input/e";

    public Day5() throws Exception {
        // Lese die Eingabedatei
        this.readInput(inputFile);

        // Der Inhalt der Datei steht jetzt zeilenweise im 
        // Attribut inputLines

        // Kontrollausgabe
        this.printInput();
    }

    public int partOne() {
        ArrayList<Long> freshrange = new ArrayList<>();
        int fresh = 0;
        int blankLine = -1;
        for(String i:inputLines){
            blankLine++;
            if(i.equals("")) break;
            String[] srange = i.split("-");
            long[] range = {Long.parseLong(srange[0]),Long.parseLong(srange[1])};
            for(long id = range[0]; id<=range[1]; id++){
                if(!freshrange.contains(id)){
                    freshrange.add(id);
                }
            }
            System.out.println(blankLine);
        }
        
        for(int i = blankLine+1; i<inputLines.size(); i++){
            if(freshrange.contains(Long.parseLong(inputLines.get(i)))) fresh++;
        }
        return fresh;
    }

    public int partTwo() {
        for(String zeile: inputLines) {
            // ArrayList<Character> zahlen = new ArrayList<>();

        }

        return 0;
    }

}
