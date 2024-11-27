package com.eduardo.interfaces.catalogoproducto.modelo;

public abstract class Producto implements IProducto{
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
