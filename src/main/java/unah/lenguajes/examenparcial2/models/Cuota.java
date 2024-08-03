package unah.lenguajes.examenparcial2.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "cuotas")
public class Cuota {
   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int codigoCuota;

    private int mes;

    private double interes;
    private double capital;
    private double saldo;
    private int codigoPrestamo;


    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "codigoPrestamo", referencedColumnName = "codigoPrestamo")
    private Prestamo prestamos;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente cliente;
}