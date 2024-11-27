package com.eduardo.interfaces.catalogoproducto.modelo;

public class TvLcd extends Electronico{
    private int pulgada;

    public TvLcd(String fabricante, int precio, int pulgada) {
        super(fabricante, precio);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.8;
    }
}
