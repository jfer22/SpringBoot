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
public class UserController {
    
    @Autowired
    private IPersonaService persoServ;
    
    
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    
    
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersonas();
    }
    
    
    
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @DeleteMapping ("/deleteUser/{id}")
    public void  borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
        
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @GetMapping ("/update/{id}")
    public Persona  buscarPersona (@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
    
        
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @PutMapping ("/update/{id}")
    public void editarPersona (@RequestBody Persona pers){
        persoServ.editarPersona(pers);
    }
    
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @GetMapping(value = "/login/{email}/{contrasena}")
    public Persona buscarPorEmailAndContrasena(@PathVariable String email, @PathVariable String contrasena)  {
        return persoServ.buscarPorEmailAndContrasena(email, contrasena);
    }
    
    

}
