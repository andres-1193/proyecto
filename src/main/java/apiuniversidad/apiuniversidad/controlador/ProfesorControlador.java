package apiuniversidad.apiuniversidad.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apiuniversidad.apiuniversidad.modelos.Profesor;
import apiuniversidad.apiuniversidad.interfaces.IProfesorServicio;



@RestController
@RequestMapping("/profesores")
public class ProfesorControlador {
    @Autowired
    private IProfesorServicio servicio;

    @RequestMapping("/listar")
    public List<Profesor>  getListar() {
       
        return servicio.listar();
        

    }


}
