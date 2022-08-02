
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String experiencia;
    
    public Experiencia (){
        
    }

    public Experiencia(Long id, String experiencia) {
        this.id = id;
        this.experiencia = experiencia;
    }
    
    
}
