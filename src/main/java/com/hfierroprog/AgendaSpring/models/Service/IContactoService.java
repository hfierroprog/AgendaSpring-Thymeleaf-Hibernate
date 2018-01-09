package com.hfierroprog.AgendaSpring.models.Service;

import com.hfierroprog.AgendaSpring.models.Entity.Contacto;
import java.util.List;

public interface IContactoService {
    
    public List<Contacto> findAll();
    
    public void Save(Contacto contacto);
    
    public Contacto findOne(Long id);
    
    public void Delete(Long id);
    
}
