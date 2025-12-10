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
        /* funktioniert nur bei kleinen Datenmengen (Beispiel)
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
        }

        for(int i = blankLine+1; i<inputLines.size(); i++){
        if(freshrange.contains(Long.parseLong(inputLines.get(i)))) fresh++;
        }
        return fresh;
         */
        int fresh = 0;
        int blankLine = -1;
        ArrayList<long[]> freshranges = new ArrayList<>();
        for(String i:inputLines){
            blankLine++;
            if(i.equals("")) break;
            String[] srange = i.split("-");
            long[] range = {Long.parseLong(srange[0]),Long.parseLong(srange[1])};
            freshranges.add(range);
        }
        for(int i = blankLine+1; i<inputLines.size(); i++) {
            long id = Long.parseLong(inputLines.get(i));
            for(long[] r:freshranges){
                if(id >= r[0]){
                    if(id <= r[1]){
                        fresh++;
                        break;
                    }
                }
            }
        }
        return fresh;
    }

    public long partTwo() {
        /* (s.o.) lädt zu lange bei großen Datenmengen bzw. passt nicht in ArrayList?
        ArrayList<Long> freshrange = new ArrayList<>();
        int fresh = 0;
        for(String i:inputLines){
        if(i.equals("")) break;
        String[] srange = i.split("-");
        long[] range = {Long.parseLong(srange[0]),Long.parseLong(srange[1])};
        for(long id = range[0]; id<=range[1]; id++){
        if(!freshrange.contains(id)){
        freshrange.add(id);
        }
        }
        }

        return freshrange.size();
         */
        long fresh = 0;
        ArrayList<long[]> freshranges = new ArrayList<>();
        for(String i:inputLines){ //initialisiert ArrayList mit den freshranges
            if(i.equals("")) break;
            String[] srange = i.split("-");
            long[] range = {Long.parseLong(srange[0]),Long.parseLong(srange[1])};
            long min = range[0];
            long max = range[1];
            for(long[] r:freshranges){ // prüfe für jede range, die bereits gespeichert wurde
                if(min >= r[0]){ // aktuelles min ist in einer range
                    if(min <= r[1]){
                        min = r[1]+1; // min wird zum ende der range verschoben
                    }
                }
                if(max >= r[0]){ // aktuelles max ist in einer range
                    if(max <= r[1]){
                        max = r[0]-1; // max wird zum anfang der range verschoben
                    }
                }
            }
            for(long[] r:freshranges){ //überprüfe für jede bereits gespeicherte range, ob sie komplett in der aktuellen range liegt
                if(r[0] >= min){
                    if(r[0] <= max) {
                        fresh -= (r[1]-r[0]+1); // wenn ja, dann entferne ihren Betrag
                        r[0] = 0;
                        r[1] = 0;
                    }
                }
            }
            long f = max - min +1;
            if(f >= 0){ // f negativ, falls aktuelle range komplett in anderer range war
                fresh += f;
                long[] addedRange = {min,max};
                freshranges.add(addedRange);
            }
        }
        System.out.println(fresh);
        return fresh;
    }

}
