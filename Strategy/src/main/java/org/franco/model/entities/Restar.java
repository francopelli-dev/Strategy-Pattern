package org.franco.model.entities;

public class Restar implements Estrategia{
    @Override
    public double calcular(Calculadora calculadora) {
        Double resta = calculadora.getA() - calculadora.getB();
        calculadora.almacenar(resta);
        return resta;
    }
}
