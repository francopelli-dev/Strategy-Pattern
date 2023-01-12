package org.franco.model.entities;

public class Calculadora {
    private double a;
    private double b;
    private double c;
    private Estrategia estrategia;

    public Calculadora(double a,double b, Estrategia estrategia) {
        this.a = a;
        this.b = b;
        this.estrategia = estrategia;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getC(){
        return this.c;
    }
    public void almacenar(double n) {
        this.c = n;
    }
    public void resultado(){

       System.out.println("El resultado es: "+this.estrategia.calcular(this)+"   Estrategia utilizada: "+ this.estrategia.getClass().getSimpleName());
    }
}
