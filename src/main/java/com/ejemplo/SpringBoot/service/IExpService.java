
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Experiencia;
import java.util.List;

public interface IExpService {
    
    public List<Experiencia> verExperiencias();
    public void crearExperiencia(Experiencia exp);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);
    public void editarExperiencia(Experiencia exp);
    
}
