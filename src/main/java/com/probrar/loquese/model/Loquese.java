
package com.probrar.loquese.model;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Loquese {
    
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
