package apiuniversidad.apiuniversidad.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="departamento")


public class Departamento {

    public long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(long idDepartamentor) {
        this.idDepartamento = idDepartamentor;
    }

    public String getNomDepartamento() {
        return nomDepartamento;
    }

    public void setNomDepartamento(String nomDepartamento) {
        this.nomDepartamento = nomDepartamento;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepartamento")
    private long idDepartamento;

    @Column(name ="nomDepartamento")
    private String nomDepartamento;
    
    
    @Column(name ="CampoDepartamento")
    private String campoDepartamento;
    

    @Column(name ="JefeDepartamento")
    private String JefeDepartamento;

  

public String getCampoDepartamento() {
        return campoDepartamento;
    }

    public void setCampoDepartamento(String campoDepartamento) {
        this.campoDepartamento = campoDepartamento;
    }

    public String getJefeDepartamento() {
        return JefeDepartamento;
    }

    public void setJefeDepartamento(String jefeDepartamento) {
        JefeDepartamento = jefeDepartamento;
    }

    // aqui se realiza la realcion entre la entidad profesor y departamento
    @ManyToOne ()
     private Profesor relacion;

  


}