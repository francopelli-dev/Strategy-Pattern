package org.franco.model.entities;

public class Sumar implements Estrategia{
    @Override
    public double calcular(Calculadora calculadora) {
        Double suma = calculadora.getA() + calculadora.getB();
        calculadora.almacenar(suma);
        return suma;
    }
}
