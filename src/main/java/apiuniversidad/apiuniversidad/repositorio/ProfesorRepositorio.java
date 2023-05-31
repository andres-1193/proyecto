package apiuniversidad.apiuniversidad.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apiuniversidad.apiuniversidad.modelos.Profesor;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Long> {
 
   

}
