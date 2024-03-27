package es.babel.services;

import es.babel.model.Factura;

public interface IFacturaService {

    double calculateTotalFactura(int id);
    Factura findFacturaById(int id);
}
