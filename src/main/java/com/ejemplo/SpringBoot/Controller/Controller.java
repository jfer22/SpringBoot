package com.ejemplo.SpringBoot.Controller;


import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.service.IPersonaService;
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
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersonas();
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping ("/delete/{id}")
    public void  borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/update/{id}")
    public Persona  buscarPersona (@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping ("/update/{id}")
    public void editarPersona (@RequestBody Persona pers){
        persoServ.editarPersona(pers);
    }

}
