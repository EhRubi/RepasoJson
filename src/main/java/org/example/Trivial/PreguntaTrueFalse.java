package org.example.Trivial;

public class PreguntaTrueFalse extends Pregunta{
    private boolean respuesta;


    public PreguntaTrueFalse(String pregunta, TipoPregunta tipoPregunta, Categoria categoria, Dificultad dificultad, boolean respuesta) {
        super(pregunta, tipoPregunta, categoria, dificultad);
        this.respuesta = respuesta;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "PreguntaTrueFalse{" +
                "respuesta=" + respuesta +
                '}';
    }
}
