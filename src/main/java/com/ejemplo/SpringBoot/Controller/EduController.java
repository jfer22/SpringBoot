
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Educacion;
import com.ejemplo.SpringBoot.service.IEduService;
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
public class EduController {
    
    @Autowired
    private IEduService eduServ;
    
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @PostMapping ("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @GetMapping ("/ver/edus")
    @ResponseBody   
    public List<Educacion> verEducaciones (){
        return eduServ.verEducaciones();
    }
    
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @DeleteMapping ("/deleteEdu/{id}")
    public void  borrarEducacion (@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @GetMapping ("/updateEdu/{id}")
    public Educacion  buscarEducacion (@PathVariable Long id){
        return eduServ.buscarEducacion(id);
    }
    
        
    @CrossOrigin(origins = "https://angular-host-14a9d.web.app")
    @PutMapping ("/updateEdu/{id}")
    public void editarEducacion (@RequestBody Educacion edu){
        eduServ.editarEducacion(edu);
    }
    
}
