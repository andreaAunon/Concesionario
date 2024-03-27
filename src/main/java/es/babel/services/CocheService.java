package es.babel.services;

import es.babel.model.BaseData;
import es.babel.model.Coche;
import es.babel.model.CocheDiesel;
import es.babel.model.CocheGas;

public class CocheService implements ICocheService {

    BaseData baseData = BaseData.getInstance();

    @Override
    public boolean addCoche(String matricula, String tipo) {
        if(tipo.equalsIgnoreCase("gas")){
            Coche coche = new CocheGas(matricula);
            baseData.addCoche(coche);
            return true;
        }

        if(tipo.equalsIgnoreCase("diesel")){
            Coche coche = new CocheDiesel(matricula);
            baseData.addCoche(coche);
            return true;
        }

        return false;
    }

    @Override
    public Coche findCocheByMatricula(String matricula) {
        Coche coche = baseData.findCocheByMatricula(matricula);

        if(coche != null){
            return coche;
        }

        return null;
    }

    @Override
    public boolean deleteCocheByMatricula(String matricula) {
        Coche coche = findCocheByMatricula(matricula);

        if(coche != null){
            baseData.deleteCocheByMatricula(matricula);
            return true;
        }

        return false;
    }
}
