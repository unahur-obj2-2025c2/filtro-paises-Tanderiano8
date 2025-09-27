package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroAreaMayorA extends Filtro{

    private Integer tamañoASuperar;
    

    public FiltroAreaMayorA(Integer tamañoASuperar) {
        this.tamañoASuperar = tamañoASuperar;
    }


    @Override
    public Boolean aplicar(Pais pais ) {
        return pais.getArea() >= tamañoASuperar;

    } 
    
}
