package com.hfierroprog.AgendaSpring.models.Dao;

import com.hfierroprog.AgendaSpring.models.Entity.Contacto;
import org.springframework.data.repository.CrudRepository;

public interface IContactoDao extends CrudRepository<Contacto, Long>{
    
}
