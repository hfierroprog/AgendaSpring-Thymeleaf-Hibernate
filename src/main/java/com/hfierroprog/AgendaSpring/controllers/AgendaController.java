package com.hfierroprog.AgendaSpring.controllers;

import com.hfierroprog.AgendaSpring.models.Entity.Contacto;
import com.hfierroprog.AgendaSpring.models.Service.IContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AgendaController {
    
    @Autowired
    IContactoService contactoService;
    
    @RequestMapping(value = "/")
    public String inicio(){
        return "redirect:/listar";
    }
    
    @RequestMapping(value = "/listar")
    public String listar(Model model){
        
        model.addAttribute("titulo", "Listado contactos");
        model.addAttribute("contactos", contactoService.findAll());
        model.addAttribute("paginaActual", "listar");
        
        return "listar";
    }
    
    @RequestMapping(value = "/form")
    public String Agregar(Model model){
        
        Contacto contacto = new Contacto();
        
        model.addAttribute("contacto", contacto);
        model.addAttribute("titulo", "Agregar Contacto!");
        model.addAttribute("paginaActual", "form");
        
        return "form";
    }
    
    @RequestMapping(value = "/form",method = RequestMethod.POST)
    public String validar(Contacto contacto,Model model,BindingResult result){
        
        if(result.hasErrors()){
            return "form";
        }
        
        contactoService.Save(contacto);
        
        return "redirect:/listar";
    }
}
