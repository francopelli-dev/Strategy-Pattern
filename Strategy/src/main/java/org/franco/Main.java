package org.franco;

import org.franco.model.entities.Calculadora;
import org.franco.model.entities.MultiplicarAlmacenado;
import org.franco.model.entities.Restar;
import org.franco.model.entities.Sumar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Desarrollo de patron Strategy");
        Calculadora calculadora = new Calculadora(2,5,new Sumar());
        calculadora.resultado();
        //calculadora = new Calculadora(10,4,new Restar());
        calculadora.setA(10);
        calculadora.setEstrategia(new MultiplicarAlmacenado());
        calculadora.resultado();

    }
}