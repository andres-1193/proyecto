package apiuniversidad.apiuniversidad.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="profesor")


public class Profesor{

    public long getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(long idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNomProfesor() {
        return nomProfesor;
    }

    public void setNomProfesor(String nomProfesor) {
        this.nomProfesor = nomProfesor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProfesor")
    private long idProfesor;

    @Column(name ="nomProfesor")
    private String nomProfesor;
    
    public String getApellidoProfesor() {
        return ApellidoProfesor;
    }

    public void setApellidoProfesor(String apellidoProfesor) {
        ApellidoProfesor = apellidoProfesor;
    }

    public String getTefefonoProfesor() {
        return tefefonoProfesor;
    }

    public void setTefefonoProfesor(String tefefonoProfesor) {
        this.tefefonoProfesor = tefefonoProfesor;
    }

    public String getCorreoProfesor() {
        return correoProfesor;
    }

    public void setCorreoProfesor(String correoProfesor) {
        this.correoProfesor = correoProfesor;
    }

    @Column(name ="ApellidoProfesor")
    private String ApellidoProfesor;

    @Column(name ="telefonoProfesor")
    private String tefefonoProfesor;
    
    
    @Column(name ="correoProfesor")
    private String correoProfesor;
}