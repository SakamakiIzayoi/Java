/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ueberarbeitetkreistest;

/**
 *
 * @author Schueler
 */
public class Kreis {
    
     // --------- Hier kommen die Attribute der Klasse (Datenelement)

    double radius;
    static int zaehler; 

    // --------- Hier kommen die Konstruktoren ---------

    public Kreis(){
        setRadius(0);
        // radius = 0; ging auch, aber wenn man get/set hat, dann besser diese nutzen!
        zaehler++;
    }

    // --------- Hier kommen die Methoden (auch get/set) ---------

    double getRadius(){
        return radius;
    }

    void setRadius(double r){
        this.radius = r;
    }

    double getUmfang(){
        return 2 * Math.PI * getRadius();
    }

    double getFlaeche(){
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    void setUmfang(double u){
        setRadius( u /(2 * Math.PI) );
    }

    void setFlache(double f){
        setRadius( Math.sqrt(f / (2*Math.PI) ) );
    }


    @Override
    public String toString() {
        return "Kreis Radius: "+getRadius() +"\t"
                +" Umfang: "+getUmfang()+"\t"
                +" Fläche: "+getFlaeche();
    }
}
