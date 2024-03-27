package es.babel.model;

public class PiezaFiltro extends Pieza{

    private String tipoDeFiltro;

    public PiezaFiltro(double price, String tipoDeFiltro) {
        super(price);
        this.tipoDeFiltro = tipoDeFiltro;
    }

    public String getTipoDeFiltro() {
        return tipoDeFiltro;
    }

    public void setTipoDeFiltro(String tipoDeFiltro) {
        this.tipoDeFiltro = tipoDeFiltro;
    }
}
