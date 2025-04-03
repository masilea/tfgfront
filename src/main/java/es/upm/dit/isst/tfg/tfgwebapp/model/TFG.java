package es.upm.dit.isst.tfg.tfgwebapp.model;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.DecimalMax;
import com.fasterxml.jackson.annotation.*;

public class TFG {
    @Email private String alumno;
    @Email private String tutor;
    @NotEmpty private String titulo;
    private String resumen;
    private Estado estado;
    private URI memoria;
    @PositiveOrZero @DecimalMax("10.0") private Double calificacion;
    private Boolean matriculaHonor;
    private Sesion sesion;

    
    public TFG(String alumno, String tutor, String titulo, String resumen, Estado estado, URI memoria,
            Double calificacion, Boolean matriculaHonor, Sesion sesion) {
        this.alumno = alumno;
        this.tutor = tutor;
        this.titulo = titulo;
        this.resumen = resumen;
        this.estado = estado;
        this.memoria = memoria;
        this.calificacion = calificacion;
        this.matriculaHonor = matriculaHonor;
        this.sesion = sesion;
    }
    
    public String getAlumno() {
        return alumno;
    }
    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }
    public String getTutor() {
        return tutor;
    }
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getResumen() {
        return resumen;
    }
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public URI getMemoria() {
        return memoria;
    }

    @JsonProperty
    public void setMemoria(URI memoria) {
        this.memoria = memoria;
    }

    @JsonGetter("memoria")
    public URI getDireccionMemoria() throws URISyntaxException {
        return new URI("./memoria");
    }

    public Double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
    public Boolean getMatriculaHonor() {
        return matriculaHonor;
    }
    public void setMatriculaHonor(Boolean matriculaHonor) {
        this.matriculaHonor = matriculaHonor;
    }
    public Sesion getSesion() {
        return sesion;
    }
    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((alumno == null) ? 0 : alumno.hashCode());
        result = prime * result + ((tutor == null) ? 0 : tutor.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((resumen == null) ? 0 : resumen.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((calificacion == null) ? 0 : calificacion.hashCode());
        result = prime * result + ((matriculaHonor == null) ? 0 : matriculaHonor.hashCode());
        result = prime * result + ((sesion == null) ? 0 : sesion.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TFG other = (TFG) obj;
        if (alumno == null) {
            if (other.alumno != null)
                return false;
        } else if (!alumno.equals(other.alumno))
            return false;
        if (tutor == null) {
            if (other.tutor != null)
                return false;
        } else if (!tutor.equals(other.tutor))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (resumen == null) {
            if (other.resumen != null)
                return false;
        } else if (!resumen.equals(other.resumen))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (calificacion == null) {
            if (other.calificacion != null)
                return false;
        } else if (!calificacion.equals(other.calificacion))
            return false;
        if (matriculaHonor == null) {
            if (other.matriculaHonor != null)
                return false;
        } else if (!matriculaHonor.equals(other.matriculaHonor))
            return false;
        if (sesion == null) {
            if (other.sesion != null)
                return false;
        } else if (!sesion.equals(other.sesion))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "TFG [alumno=" + alumno + ", tutor=" + tutor + ", titulo=" + titulo + ", resumen=" + resumen
                + ", estado=" + estado + ", calificacion=" + calificacion + ", matriculaHonor="
                + matriculaHonor + ", sesion=" + sesion + "]";
    }

    
}

