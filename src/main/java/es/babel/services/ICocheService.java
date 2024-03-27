package es.babel.services;

import es.babel.model.Coche;

public interface ICocheService {

    boolean addCoche(String matricula, String tipo);
    boolean deleteCocheByMatricula(String matricula);
    Coche findCocheByMatricula(String matricula);
}
