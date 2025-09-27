package ar.edu.unahur.obj2.filters;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.model.Pais;
import ar.edu.unahur.obj2.service.IPaisService;
import ar.edu.unahur.obj2.service.PaisService;

public class FiltroTest {

    private List<Pais> paises;

    @BeforeEach
    void recibeListaDePaises() {
        IPaisService paisService = new PaisService();
        List<Pais> paises = paisService.getPaises();
    }


    @Test
    void FiltroAreaMayorA(){
        IFiltro areaMayorAUnMillon = new FiltroAreaMayorA(10000000);
        List<Pais> paisesGrandes = paises.stream().filter(p -> areaMayorAUnMillon.aplicar(p)).collect(Collectors.toList());
        Set<Pais> paisesGrandes2 = paises.stream().filter(p -> areaMayorAUnMillon.aplicar(p)).collect(Collectors.toSet());
        paisesGrandes.stream().forEach( p -> System.out.println(p.toString()));
    }

    @Test
    void FiltroPorIdioma(){
        IFiltro hablanEspañol = new FiltroPorIdioma("Spanish");
        List<Pais> hablanEnEspañol = paises.stream().filter(p -> p.equals(hablanEspañol.aplicar(p))).collect(Collectors.toList());
        hablanEnEspañol.stream().forEach( p -> System.out.println(p.toString()));

    }

}
