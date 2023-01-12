package org.franco.model.entities;

public class Calculadora {
    private double a;
    private double b;
    private Estrategia estrategia;

    public Calculadora(double a,double b, Estrategia estrategia) {
        this.a = a;
        this.b = b;
        this.estrategia = estrategia;
    }

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }
    public void resultado(){

       System.out.println("El resultado es: "+this.estrategia.calcular(this)+"   Estrategia utilizada: "+ this.estrategia.getClass().getSimpleName());
    }
}
