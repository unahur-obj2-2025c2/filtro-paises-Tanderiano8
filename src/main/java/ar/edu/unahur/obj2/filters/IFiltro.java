package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public interface IFiltro {

    Boolean aplicar(Pais pais);

    IFiltro and(IFiltro filtro);

    IFiltro or(IFiltro filtro);

}
