package es.babel.controllers;

import es.babel.model.Coche;
import es.babel.services.FacturaService;
import es.babel.services.ICocheService;
import es.babel.services.CocheService;
import es.babel.services.IFacturaService;

public class CocheController {

    private ICocheService tallerService;

    public CocheController(){
        this.tallerService = new CocheService();
    }

    public String addCoche(String matricula, String tipo){
        if(tipo.equalsIgnoreCase("gas") || tipo.equalsIgnoreCase("diesel")){
            boolean isAdd = this.tallerService.addCoche(matricula, tipo);
            return isExitosa(isAdd);
        } else {
            return "El tipo de vehículo no es correcto.";
        }
    }

    public String deleteCoche(String matricula){
        boolean isDeleted = tallerService.deleteCocheByMatricula(matricula);
        return isExitosa(isDeleted);
    }

    public String findCocheByMatricula(String matricula){
        Coche coche = tallerService.findCocheByMatricula(matricula);

        if(coche != null){
            return coche.toString();
        }

        return "No se ha encontrado un vehículo con esa matrícula.";
    }

    private String isExitosa(boolean condition){
        if(condition){
            return "Operación exitosa";
        } else {
            return "Ha ocurrido un error inesperado.";
        }
    }
}
