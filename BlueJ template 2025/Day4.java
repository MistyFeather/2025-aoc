import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Day4.
 * 
 * @author Sara Schmid 
 * @version 01.12.2024
 */
public class Day4 extends aoc2025 {
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
    String inputFile = "input/d4i.txt";

    // Input mit "i" am Ende
    //String inputFile = "input/e";

    public Day4() throws Exception {
        // Lese die Eingabedatei
        this.readInput(inputFile);

        // Der Inhalt der Datei steht jetzt zeilenweise im 
        // Attribut inputLines

        // Kontrollausgabe
        this.printInput();
    }

    public int partOne() { //
        int rolls = 0;
        int lineLength = inputLines.get(0).length();
        ArrayList<int[]> pos = new ArrayList<>();

        for(int r = 0; r < inputLines.size(); r++) {
            String line = inputLines.get(r);
            for(int c = 0; c<lineLength; c++) {
                if(line.charAt(c) == '@') { //prüfe Umgebung der aktuellen Rolle, falls auf Rolle
                    int adj = 0;
                    if(c > 0 && line.charAt(c-1) == '@') adj++; //(+nächste Zeile) prüfe links und rechts
                    if(c < lineLength-1 && line.charAt(c+1) == '@') adj++;
                    if(r > 0) { //prüfe obere Zeile, falls vorhanden
                        String up = inputLines.get(r-1);
                        if(up.charAt(c) == '@') adj++;
                        if(c > 0 && up.charAt(c-1) == '@') adj++;
                        if(c < lineLength-1 && up.charAt(c+1) == '@') adj++;
                    }
                    if(r < inputLines.size()-1) { //prüfe unterste Zeile, falls vorhanden
                        String down = inputLines.get(r+1);
                        if(down.charAt(c) == '@') adj++;
                        if(c > 0 && down.charAt(c-1) == '@') adj++;
                        if(c < lineLength-1 && down.charAt(c+1) == '@') adj++;
                    }
                    if(adj < 4) {
                        rolls++;
                    }
                }
            }
        }
        return rolls;
    }

    public int partTwo() {
        int allrolls = 0;
        int rolls = 1;

        String[] lines = new String[inputLines.size()]; //input steht im String-Array "lines[]"
        for(int i = 0; i<lines.length; i++) {
            lines[i] = inputLines.get(i);
        }
        int lineLength = lines[0].length();

        while(rolls > 0){
            rolls = 0;
            ArrayList<int[]> pos = new ArrayList<>();
            for(int r = 0; r < lines.length; r++) {
                String line = lines[r];
                for(int c = 0; c<lineLength; c++) {
                    if(line.charAt(c) == '@') { //prüfe Umgebung der aktuellen Rolle, falls auf Rolle
                        int adj = 0;
                        if(c > 0 && line.charAt(c-1) == '@') adj++; //(+nächste Zeile) prüfe links und rechts
                        if(c < lineLength-1 && line.charAt(c+1) == '@') adj++;
                        if(r > 0) { //prüfe obere Zeile, falls vorhanden
                            String up = lines[r-1];
                            if(up.charAt(c) == '@') adj++;
                            if(c > 0 && up.charAt(c-1) == '@') adj++;
                            if(c < lineLength-1 && up.charAt(c+1) == '@') adj++;
                        }
                        if(r < lines.length-1) { //prüfe unterste Zeile, falls vorhanden
                            String down = lines[r+1];
                            if(down.charAt(c) == '@') adj++;
                            if(c > 0 && down.charAt(c-1) == '@') adj++;
                            if(c < lineLength-1 && down.charAt(c+1) == '@') adj++;
                        }
                        if(adj < 4) {
                            rolls++;
                            int[] position = {r,c};
                            pos.add(position);
                        }
                    }
                }
            }
            for(int[] i:pos) {
                String l = lines[i[0]];
                lines[i[0]] = l.substring(0,i[1]) + '.' + l.substring(i[1]+1);
            }
            for(String i:lines) {
                System.out.println(i);
            }
            allrolls += rolls;
        }

        return allrolls;
    }

}
