package com.eduardo.interfaces.catalogoproducto.modelo;

public abstract class Electronico extends Producto implements IElectronico{
    private String fabricante;

    public Electronico(String fabricante, int precio) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}
