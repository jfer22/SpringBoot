
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.service.IExpService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpController {

    @Autowired
    private IExpService expServ;
    
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @PostMapping ("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @GetMapping ("/ver/exps")
    @ResponseBody
    public List<Experiencia> verExperiencias (){
        return expServ.verExperiencias();
    }
    
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @DeleteMapping ("/deleteExp/{id}")
    public void  borrarExperiencia (@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @GetMapping ("/updateExp/{id}")
    public Experiencia  buscarExperiencia (@PathVariable Long id){
        return expServ.buscarExperiencia(id);
    }
    
        
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @PutMapping ("/updateExp/{id}")
    public void editarExperiencia (@RequestBody Experiencia exp){
        expServ.editarExperiencia(exp);
    }

}
