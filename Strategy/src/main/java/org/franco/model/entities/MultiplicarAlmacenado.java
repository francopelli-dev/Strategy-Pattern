package org.franco.model.entities;

public class MultiplicarAlmacenado implements Estrategia{
    @Override
    public double calcular(Calculadora calculadora) {
        return calculadora.getC() * calculadora.getA();
    }
}
