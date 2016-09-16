/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung05; // Ein Packet erstellen
class Bruch {   //Klasse erstellt
    int zaehler;//variable definieren
    int nenner;
}

/**
 *
 * @author HP
 */
public class Uebung05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
     Bruch a = new Bruch();
     a.zaehler =3 ;
     a.nenner =4 ;
     a.zaehler++; //hochählen wodurch er(automatisch) nicht null ist
     if(a.nenner != 0) //Prüfen ob der Nenner gleich null ist
     System.out.print("Bruch a = " + a.zaehler +"/"+ a.nenner);///Bruchausgabe     
      }
    
}
