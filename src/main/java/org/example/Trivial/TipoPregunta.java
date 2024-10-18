package org.example.Trivial;

public enum TipoPregunta {

    MULTIPLE("multiple"), BOOLEAN("Verdadero/Falso");

    private String tipoPregunta;

    TipoPregunta(String tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }

    public String getTipoPregunta() {
        return tipoPregunta;
    }
}
