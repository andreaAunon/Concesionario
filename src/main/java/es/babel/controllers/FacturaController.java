package es.babel.controllers;

import es.babel.model.Factura;
import es.babel.services.FacturaService;
import es.babel.services.IFacturaService;

public class FacturaController {

    private IFacturaService facturaService;

    public FacturaController(){
        this.facturaService = new FacturaService();
    }

    public String findFacturaById(String id){
        Factura factura = facturaService.findFacturaById(Integer.parseInt(id));

        if(factura != null){
            return factura.toString();
        }

        return "No se ha encontrado una factura con ese id.";
    }

    public String calculateTotalFactura(String id){
        double amount = calculateFactura(Integer.parseInt(id));

        if(amount > -1){
            return String.valueOf(amount);
        }

        return "Error al calcular el total de la factura";
    }

    private double calculateFactura(int id){
        Factura factura = facturaService.findFacturaById(id);

        if(factura != null){
            return facturaService.calculateTotalFactura(id);
        }

        return -1;
    }
}
