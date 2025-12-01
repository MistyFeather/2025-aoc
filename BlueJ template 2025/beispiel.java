
/**
 * Beschreiben Sie hier die Klasse beispiel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class beispiel extends aoc2025 {
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
    String inputFile = "input/bsp1i";
    
    // Input mit "i" am Ende
    //String inputFile = "input/bsp1i";

    public beispiel() throws Exception {
        // Lese die Eingabedatei
        this.readInput(inputFile);

        // Der Inhalt der Datei steht jetzt zeilenweise im 
        // Attribut inputLines

        // Kontrollausgabe
        this.printInput();
    }

    public int partOne() {
        
        int maxKalorien=0;
        int rucksackKalorien=0;
        
        for(String line: inputLines) {
            System.out.println(line);
            
            if(! line.equals("") ) {
                int zeilenKalorien = Integer.parseInt(line);
                System.out.println("Addiere " + zeilenKalorien + " zum Rucksack");
                rucksackKalorien += zeilenKalorien;
            } else {
                if(rucksackKalorien > maxKalorien) {
                    maxKalorien = rucksackKalorien;
                }
                rucksackKalorien=0;
            }
            
            
                        
        }
        
    
        return maxKalorien;
    }

    public int partTwo() {
        int answer=0;
        // Hier passiert was
        
        return answer;
    }

}
