package org.franco.model.entities;

public class Sumar implements Estrategia{
    @Override
    public double calcular(Calculadora calculadora) {

        return calculadora.getA() + calculadora.getB();
    }
}
