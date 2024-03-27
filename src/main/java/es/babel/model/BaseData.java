package es.babel.model;

import java.util.ArrayList;
import java.util.List;

public class BaseData {

    private static BaseData instance;
    private List<Coche> coches;
    private List<Factura> facturas;

    public BaseData(){
        this.coches = new ArrayList<>();
        this.facturas = new ArrayList<>();
    }

    public static BaseData getInstance() {
        if (instance == null) {
            instance = new BaseData();
        }
        return instance;
    }

    public void addCoche(Coche coche){
        coches.add(coche);
    }

    public void deleteCocheByMatricula(String matricula){
        for(Coche coche : coches){
            if(coche.getMatricula().equals(matricula)){
                coches.remove(coche);
                break;
            }
        }
    }

    public Coche findCocheByMatricula(String matricula){
        for(Coche coche : coches){
            if(coche.getMatricula().equals(matricula)){
                return coche;
            }
        }

        return null;
    }

    public void addFactura(Factura factura){
        facturas.add(factura);
    }

    public Factura findFacturaById(int id){
        for(Factura factura : facturas){
            if(factura.getId() == id){
                return factura;
            }
        }

        return null;
    }
}
