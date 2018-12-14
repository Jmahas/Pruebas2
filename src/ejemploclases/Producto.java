/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclases;

/**
 *
 * @author dam
 */
public class Producto {
    String denominacion="";
    int existencias;
    float pvp;

    private Producto() {
        denominacion="Oxford";
        existencias=0;
        pvp=0;
    }

    public Producto(String denominacion, int existencias, float pvp) {
        this.denominacion = denominacion;
        this.existencias = existencias;
        this.pvp = pvp;
    }

    Producto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Producto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
  
    
}
