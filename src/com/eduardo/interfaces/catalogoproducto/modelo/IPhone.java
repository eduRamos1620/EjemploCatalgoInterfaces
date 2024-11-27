package com.eduardo.interfaces.catalogoproducto.modelo;

public class IPhone extends Electronico{
    private String modelo;
    private String color;

    public IPhone(String fabricante, int precio, String modelo, String color) {
        super(fabricante, precio);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.9;
    }
}
