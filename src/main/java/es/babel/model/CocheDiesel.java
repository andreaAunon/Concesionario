package es.babel.model;

public class CocheDiesel extends Coche{

    public CocheDiesel(String matricula) {
        super(matricula);
    }

    @Override
    public String toString() {
        return "Coche diesel con matrícula " + getMatricula();
    }
}
