package org.example.Trivial;

public class AppTrivial {
    public static void main(String[] args) {
        TipoPregunta tipo = TipoPregunta.MULTIPLE;
        TipoPregunta tipo2 = TipoPregunta.MULTIPLE;

        System.out.println("tipo.getTipoPregunta() = " + (tipo = tipo2));
    }
}
