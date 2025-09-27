package ar.edu.unahur.obj2.filters;

import java.util.List;

public abstract class Filtro implements IFiltro {

    protected List<IFiltro> filtros;

    public void agregarFiltro(IFiltro unFiltro){
        filtros.add(unFiltro);
    }

    @Override
    public abstract IFiltro and(IFiltro filtro) ;
    

    @Override
    public abstract IFiltro or(IFiltro filtro);


}
