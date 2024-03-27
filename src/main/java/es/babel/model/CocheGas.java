package es.babel.model;

public class CocheGas extends Coche{

    public CocheGas(String matricula) {
        super(matricula);
    }

    @Override
    public String toString() {
        return "Coche gas con matrícula " + getMatricula();
    }
}
