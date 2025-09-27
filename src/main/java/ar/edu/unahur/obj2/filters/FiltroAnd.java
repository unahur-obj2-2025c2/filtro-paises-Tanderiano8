package ar.edu.unahur.obj2.filters;

import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroAnd extends FiltroCompuesto {

    public FiltroAnd(IFiltro filtro, IFiltro nuevo){
        filtros.add(filtro);
        filtros.add(nuevo);
    }

    public FiltroAnd(List<IFiltro> filtrosNuevos){
        filtros.addAll(filtrosNuevos);
    }




    @Override
    public Boolean aplicar(Pais pais) {
        return filtros.stream().allMatch(filtro -> filtro.aplicar(pais));
    }

    @Override
    public IFiltro or(IFiltro filtro) {
        return new FiltroOr(this, filtro);
        
    }



}
