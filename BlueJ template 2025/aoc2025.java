
/**
 * Einfache Grundklassse für den TakeOff für den Advent of Code 2021
 * 
 * @author Frank Schiebel
 * @version 0.2
 * 
 * Simplified for AOC 2023
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;

public class aoc2025
{
    // Eingabedatei (kann man hier ändern, weil das Eingeben 
    // der passenden Datei bei jeder Instaziierung lästig ist)
    // Vorshlag für die Benennung d<Tagesnummer>[e|i] 
    // e: Example für die Beispieldaten
    // i: Input für die Rätseleingabe
    String inputFile = "";

    // Eingabe wird in eine ArrayList von String-Arrays ("input") eingelesen.
    // Das muss man je nach Eingabeformat und Aufgabenstellung sicherlich 
    // weiterverarbeiten und in eine andere Datenstruktur überführen.
    ArrayList<String> inputLines;

    /**
     * Konstruktor für Objekte der Klasse aoc2021
     * 
     * @param  filename      Dateiname des Rätsel-Inputs (z.B. "day0") 
     *                    im Projektverzeichnis.
     **/
    public aoc2025() throws Exception {

    }
    /**
     * Beispielhafte Methode zum zeilenweisen Einlesen 
     * der Daten in die ArrayList inputLines.
     **/

    public void readInput(String filename) throws Exception {

        Scanner s = new Scanner(new File(filename));
        inputLines = new ArrayList<>();

        while (s.hasNext()){
            inputLines.add(s.nextLine());
        }
        s.close();

    }

    /**
     * Kontrollausgabe der inputLines ArrayList.
     **/
    public void printInput() {
        // Ausgabe der Input-Datei
        Iterator<String> iter = inputLines.iterator();
        int lnum = 0;
        int maxFN = 0;
        int minFN = 0;
        System.out.println("");
        System.out.println("___ Zeilen _______");
        while(iter.hasNext()) {
            String line=iter.next();
            System.out.println(lnum + ": " + line);
            lnum++;
        }

        System.out.println("");
        System.out.println("___ Info _______");
        System.out.println(lnum + " Zeilen");
    }
    
    
}
