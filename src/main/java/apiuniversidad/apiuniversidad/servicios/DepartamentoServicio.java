package apiuniversidad.apiuniversidad.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apiuniversidad.apiuniversidad.interfaces.IDepartamentoServicio;
import apiuniversidad.apiuniversidad.modelos.Departamento;
import apiuniversidad.apiuniversidad.repositorio.DepartamentoRepositorio;

@Service
public class DepartamentoServicio implements IDepartamentoServicio {

    @Autowired
    DepartamentoRepositorio repositorio;

    @Override
    public Departamento guardar(Departamento departamento) {
        return repositorio.save(departamento);

    }

    @Override
    public java.util.List<Departamento> listar() {
        return repositorio.findAll();
    }

}
