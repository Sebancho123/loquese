 
package com.probrar.loquese.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Loquese {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_mia;
    private String nombre;
    private String apellido;

    public Loquese() {
    }

    public Loquese(Long id_mia, String nombre, String apellido) {
        this.id_mia = id_mia;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
}
