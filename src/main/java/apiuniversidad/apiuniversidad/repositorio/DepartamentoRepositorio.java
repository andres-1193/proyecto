package apiuniversidad.apiuniversidad.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apiuniversidad.apiuniversidad.modelos.Departamento;

@Repository
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Long> {
   
}