package es.babel.services;

import es.babel.model.BaseData;
import es.babel.model.Coche;
import es.babel.model.Factura;
import es.babel.model.Pieza;

import java.util.Map;

public class FacturaService implements IFacturaService{

    BaseData baseData = BaseData.getInstance();

    @Override
    public double calculateTotalFactura(int id) {
        Factura factura = findFacturaById(id);

        if(factura != null){
            return calcularTotal(factura);
        }

        return -1;
    }

    @Override
    public Factura findFacturaById(int id) {
        Factura factura = baseData.findFacturaById(id);

        if(factura != null){
            return factura;
        }

        return null;
    }

    private double calcularTotal(Factura factura){
        double total = 0.0;
        for (Map.Entry<Pieza, Integer> entry : factura.getPiezas().entrySet()) {
            Pieza pieza = entry.getKey();
            int cantidad = entry.getValue();
            total += pieza.getPrice() * cantidad;
        }

        return total;
    }
}
