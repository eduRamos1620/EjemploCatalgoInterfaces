package com.eduardo.interfaces.catalogoproducto.modelo;

import java.util.Date;

public interface ILibro {
    Date getFechaPublicacion();
    String getAutor();
    String getTitulo();
    String getEditora();
}
