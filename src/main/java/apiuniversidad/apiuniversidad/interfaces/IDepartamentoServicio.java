package apiuniversidad.apiuniversidad.interfaces;

import java.util.List;

import apiuniversidad.apiuniversidad.modelos.Departamento;

public interface IDepartamentoServicio {
    public List<Departamento> listar();

    public Departamento guardar(Departamento departamento);

}
