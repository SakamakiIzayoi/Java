/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruchtest1.java;
class Bruch {   //Klasse erstellt
    int zaehler;//variable definieren
    int nenner;
}
/**
 *
 * @author HP
 */
public class Bruchtest1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Bruch a= new Bruch(); //a als Bruch definieren
     a.zaehler = 3; // dem Bruch den Wert 3/4 zuweisen
     a.nenner = 4;
     Bruch b = new Bruch(); //b als zweiten Bruch definieren
     b.zaehler = a.zaehler; //b den Wert von a zuweisen
     b.nenner = a.nenner;
     if (a == b ) {
     
     } //liefert false zurück
    }
    
}
