import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Day3.
 * 
 * @author Sara Schmid 
 * @version 01.12.2024
 */
public class Day3 extends aoc2025 {
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
    String inputFile = "input/d3e.txt";

    // Input mit "i" am Ende
    //String inputFile = "input/e";

    public Day3() throws Exception {
        // Lese die Eingabedatei
        this.readInput(inputFile);

        // Der Inhalt der Datei steht jetzt zeilenweise im 
        // Attribut inputLines

        // Kontrollausgabe
        this.printInput();
    }

    public int partOne() {
        int jolts = 0;
        for(String line: inputLines){
            int length = line.length();
            char digit1 = '0';
            char digit2 = '0';
            for(int i = 0; i < length-1; i++) {
                if(line.charAt(i) > digit1) {
                    digit1 = line.charAt(i);
                }
            }
            for(int i = line.indexOf(digit1)+1; i < length; i++) {
                if(line.charAt(i) > digit2) {
                    digit2 = line.charAt(i);
                }
            }
            int jolt = Integer.parseInt(""+digit1+digit2);
            System.out.println(jolt);
            jolts += jolt;
        }
        System.out.println(jolts);
        return jolts;
    }

    public int partTwo() {
        int jolts = 0;
        for(String line: inputLines){
            int length = line.length();
            char[] digits = new char[12];
            for(char i: digits) {
                i = '0';
            }
            for(int r = 11; r>0; r--) {
                for(int d = 0; d < digits.length; d++){
                    for(int i = 0; i < length-r; i++) {
                        if(line.charAt(i) > digits[d]) {
                            digits[d] = line.charAt(i);
                        }
                    }
                }
            }
            int jolt = 0;
            for(char i: digits) {
                jolt += Integer.parseInt(""+i);
            }
            System.out.println(jolt);
            jolts += jolt;
        }
        System.out.println(jolts);
        return jolts;
    }

}
