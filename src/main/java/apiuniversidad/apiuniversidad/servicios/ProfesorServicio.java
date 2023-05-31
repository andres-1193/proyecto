package apiuniversidad.apiuniversidad.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apiuniversidad.apiuniversidad.interfaces.IProfesorServicio;
import apiuniversidad.apiuniversidad.modelos.Profesor;
import apiuniversidad.apiuniversidad.repositorio.ProfesorRepositorio;

@Service
public class ProfesorServicio implements IProfesorServicio{

    @Autowired
    ProfesorRepositorio repositorio;

   @Override
    public Profesor guardar(Profesor profesor){ 
        return repositorio.save(profesor);

    }
    @Override
    public java.util.List<Profesor> listar() {
        return repositorio.findAll();
    }
      
    
    
}
