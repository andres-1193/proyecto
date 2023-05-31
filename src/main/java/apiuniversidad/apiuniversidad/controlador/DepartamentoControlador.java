package apiuniversidad.apiuniversidad.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apiuniversidad.apiuniversidad.modelos.Departamento;
import apiuniversidad.apiuniversidad.interfaces.IDepartamentoServicio;

@RestController
@RequestMapping("/departamento")
public class DepartamentoControlador {
    @Autowired
    private IDepartamentoServicio servicio;

    @RequestMapping("/listar")
    public List<Departamento> getListar() {

        return servicio.listar();

    }

}
