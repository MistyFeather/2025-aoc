import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Day6.
 * 
 * @author Sara Schmid 
 * @version 01.12.2024
 */
public class Day6 extends aoc2025 {
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
    String inputFile = "input/d6e.txt";

    // Input mit "i" am Ende
    //String inputFile = "input/e";

    public Day6() throws Exception {
        // Lese die Eingabedatei
        this.readInput(inputFile);

        // Der Inhalt der Datei steht jetzt zeilenweise im 
        // Attribut inputLines

        // Kontrollausgabe
        this.printInput();
    }

    public long partOne() {
        long sum = 0;
        int index = 0;
        boolean collumn = false;
        String[] lines = new String[inputLines.size()];
        for(int i = 0; i<lines.length; i++) { //inputLines als Array
            lines[i] = inputLines.get(i);
        }
        //Schleife drum herum für jede Matheaufgabe
        //index = 0;
        while(!collumn){
            collumn = true;
            while(lines[0].charAt(index) != ' ') {
                index++;
            }
            for(String s:lines){
                if(s.charAt(index) != ' '){
                    collumn = false;
                }
            }
        }
        //Substrings und Rechnung
        int[] number = new int[lines.length-1];
        long result = 0;
        if(lines[lines.length-1].charAt(0) == '*') result = 1;
        for(int s = 0; s < lines.length-1; s++) { //für jede Zeile, in der eine Zahl steht
            if(lines[lines.length-1].charAt(0) == '+') {
                result += Integer.parseInt(lines[s].substring(0,index).strip()); //Zahl der aktuellen Zeile
            }
            else if(lines[lines.length-1].charAt(0) == '*') {
                result *= Integer.parseInt(lines[s].substring(0,index).strip());
            }
            lines[s] = lines[s].substring(index+1); //gebrauchten Teil abschneiden
        }
        lines[lines.length-1] = lines[lines.length-1].substring(index+1); //letze Zeile
        sum += result;
        
        return sum;
    } // To-do: Erkennung am Ende der Zeile (kein Leerzeichen) + Wiederholung für jede Rechnung (Schleife)

    public int partTwo() {
        for(String zeile: inputLines) {
            // ArrayList<Character> zahlen = new ArrayList<>();

        }

        return 0;
    }

}
