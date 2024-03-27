package es.babel.model;

public abstract class Coche {

    private String matricula;

    public Coche(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
