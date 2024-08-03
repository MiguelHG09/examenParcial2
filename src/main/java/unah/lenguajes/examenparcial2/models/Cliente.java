package unah.lenguajes.examenparcial2.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "cliente")
public class Cliente {

    @Id
    private int dni;

    private String nombre;

    private String apellido;

    private String telefono;

@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Prestamo prestamo;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Cuota cuota;

    
}


