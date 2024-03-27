package es.babel.model;

import java.util.Map;

public class Factura {

    private int id;
    private Map<Pieza, Integer> piezas;


    public Factura(int id, Map<Pieza, Integer> piezas) {
        this.id = id;
        this.piezas = piezas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Pieza, Integer> getPiezas() {
        return piezas;
    }

    public void setPiezas(Map<Pieza, Integer> piezas) {
        this.piezas = piezas;
    }
}
