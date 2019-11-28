/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12.pkg1;

/**
 *
 * @author sverdecadilla
 */
public class ZERO {
    final ZERO constante= new ZERO();
    private double real;
    private double imagirary;

    public double getReal() {
        return real;
    }

    public double getImagirary() {
        return imagirary;
    }

    public ZERO add(ZERO c) {

        return constante;
    }

    @Override
    public String toString() {
        return  "ZERO{" + "constante=" + constante + ", real=" + real + ", imagirary=" + imagirary + '}';
    }
    
    
    
    
}
