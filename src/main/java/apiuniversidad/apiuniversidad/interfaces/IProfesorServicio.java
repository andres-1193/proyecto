package apiuniversidad.apiuniversidad.interfaces;

import java.util.List;
import apiuniversidad.apiuniversidad.modelos.Profesor;

public interface IProfesorServicio{
    public List<Profesor> listar();

    public Profesor guardar(Profesor profesor);

}
