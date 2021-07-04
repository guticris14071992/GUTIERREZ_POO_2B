/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author cj_gu
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(){
        
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getx(){
        return x;
    }
    public void setY(int y){
        this.y=y;
   }
    public int gety(){
        return y;
    }
    public double distanciaEntreDosPuntos(int x1, int x2, int y1, int y2,){
        double d;
        d=Math.sqrt((Math.pov((double)(x2)-(double)(x1), 2))+(Math.pov(((double)(y2)-(double)(y1),2))));
        return d;
   }

   

    

    
}

