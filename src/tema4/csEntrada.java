/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author chima
 */
public class csEntrada {
    
    private double a;
    private double b;
    private int n;
    private double h;

    public csEntrada() {
    }

    
    public csEntrada(double a, double b, int n) {
        this.a = a;
        this.n = n;
        this.b =b;
    }
    
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    

    
}
