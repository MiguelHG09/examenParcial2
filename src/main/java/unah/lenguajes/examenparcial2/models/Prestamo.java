package unah.lenguajes.examenparcial2.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "prestamos")
@Data
public class Prestamo {

    @Id
    private String codigoPrestamo;
    
    private int fechaApertura;

    private double monto;

    private double Cuota;

    private int plazo;

    private double interes=0.09/12;
      
    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente cliente;

    @OneToOne(mappedBy = "prestamos", cascade = CascadeType.ALL)
    private Cuota cuota;
}