package pe.edu.pucp.gtics.lab1221.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;



@Getter
@Setter
@Entity
@Table(name = "distribuidoras")
public class Distributors {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddistribuidora",nullable = false)
    private Integer iddistribuidora;

    private String nombre;

    private String descripcion;

    private int fundacion;

    private String sede;

}
