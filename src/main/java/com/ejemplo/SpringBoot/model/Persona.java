
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombre;
    private String email;
    private int edad;
    private String idioma;
    
    public Persona(){
        
    }
    
    public Persona(Long id, String nombre, String apellido, String email, String idioma, int edad){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.idioma = idioma;
    }
    
}
