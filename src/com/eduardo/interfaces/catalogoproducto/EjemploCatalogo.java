package com.eduardo.interfaces.catalogoproducto;

import com.eduardo.interfaces.catalogoproducto.modelo.*;

public class EjemploCatalogo {
    public static void main(String[] args) {
        IProducto[] productos = new IProducto[6];

        productos[0] = new IPhone("Vivo", 9800, "V25e", "negro");
        productos[1] = new IPhone("Huawei", 16000, "Pura 70", "plata");
        productos[2] = new TvLcd("Samsung", 16000, 72);
        productos[3] = new Libro(340, "Toño", "El fiin esta cerca", "Maniacos");
        productos[4] = new Libro(670, "Charles", "Los raros del salon", "Anestesia");
        productos[5] = new Comics(45, "Akira", "Goku", "Toriyama", "Vegueta");

        //Recorre la lista de productos
        for(IProducto prod: productos){
            System.out.println("Tipo de: " + prod.getClass().getSimpleName());
            System.out.println(" - ");
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println(" - ");
            System.out.println("Precio final: " + prod.getPrecioVenta());

            //Valida si es un electronico
            if(prod instanceof IElectronico){
                System.out.println(" - ");
                System.out.println("Fabricante: " + ((IElectronico) prod).getFabricante());

                //Si es un electronico valida si es un IPhone
                if(prod instanceof IPhone){
                    System.out.println(" - ");
                    System.out.println("Model: " + ((IPhone) prod).getModelo());
                    System.out.println(" - ");
                    System.out.println("Color: " + ((IPhone) prod).getColor());
                }

                //Si es un electroncio valida si es tv
                if(prod instanceof TvLcd){
                    System.out.println(" - ");
                    System.out.println("Pulgadas: " + ((TvLcd) prod).getPulgada());
                }
            }
            //Valida si es un libro
            if (prod instanceof ILibro){
                System.out.println(" - ");
                System.out.println("Titulo: " + ((ILibro) prod).getTitulo());
                System.out.println(" - ");
                System.out.println("Autor: " + ((ILibro) prod).getAutor());

                //Si es un libro valida si es un comic
                if(prod instanceof Comics){
                    System.out.println(" - ");
                    System.out.println("Personaje: " + ((Comics) prod).getPersonaje());
                }
            }
            System.out.println();
        }
    }
}
