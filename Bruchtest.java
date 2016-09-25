/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruchtest;

import javax.swing.*;

/**
 * Created by reisma on 05.09.16.(überarbeitet von Maximilian Zibert)
 * Klasse zum Testen der "eigentlichen Klasse" Bruch
 */
public class BruchTest {


    //ausführbare Methode (sonst kann man das Programm nicht starten)
    public static void main (String[]args){

        Bruch b = new Bruch();      ///neuer Bruch wird erstellt

        b.setZaheler(16);           // Werte werden gesetzt
        b.setNenner(4);

        b.gekuerztausgeben();       //In Bruch1.java selbst definierte Funktion benutzen

        /** ------------------------------------------------------------------------------------------------
         * Beispiel was Passiert wenn ich ein Objekt (Datentyp) anlege und einem andere zuweise vs. primitive Datentypen
         * **/

        Bruch c = new Bruch(3);     // objekt nr.2 "Bruch c" angelegt

        Bruch d = c;                // Objekte zeigen beim gleichsetzen auf den Selben speicherbereich

        c.setNenner(9);             // es wird nun 1/9 ausgegeben ( auch in d ) siehe 2zeilen drüber

        c.ausgeben();               // c wird ausgegeben
        d.ausgeben();               // identisch zu c, wird ausgegeben


        int w = 5;                  // Bei (Primitiven!) wird der Wert nur Kopiert
        int y = w;                  // das gleiche für w

        System.out.println(w +"  "+ y); // selber wert ( in diesem fall beide 5)

        w = 10;                         // nur w wird zu 10. y behält den alten wert

        System.out.println(w +"  "+ y);  // 10 und 5


        /** ------------------------------------------------------------------------------------------------
         * Ein möglichkeit vom Benutzer werte für die Eingabe zu erhalten - hier mit eine Dialog Fenster
         *
         * **/
//////// ?????
        boolean doit = true;  // eine Variable um die while scheilfe laufen zu lassen
//////// ?????
        while (doit) { // Schleife die zu erst einmal immer weiter läuft - der Benutzer muss Sie abbrechen
            int z = Integer.parseInt( JOptionPane.showInputDialog(null, "Zähler?") );   // Dialog für Nenner - Abfrage zeigen
            int n = Integer.parseInt( JOptionPane.showInputDialog(null, "Nenner?"));

            Bruch x = new Bruch(z,n);   /// Eine neue Klasse erstellen und für den Konstruktor die Werte z,n übergeben

            x.ausgeben(); // Bruch x ausgeben

            x.gekuerztausgeben();   //In Bruch1.java selbst definierte Funktion benutzen

            // Abfragen zeigen um unsere boolean Variable zu setzen und ggf. die Schleife abzubrechen
            if (JOptionPane.YES_OPTION != JOptionPane.showOptionDialog(null, "Noch eine?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null))
            {
                doit = false;
            }

        }

        /** ------------------------------------------------------------------------------------------------ **/
        // Über das Statische Feld der Klasse (Das sich alle Objekte Teilen) kann man sehen wie viele Objekte angelegt wurden
        System.out.println("Anzahl erstellter Brüche= "+Bruch.anzahlBrueche);



    }

}