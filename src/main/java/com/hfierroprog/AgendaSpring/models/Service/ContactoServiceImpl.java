package com.hfierroprog.AgendaSpring.models.Service;

import com.hfierroprog.AgendaSpring.models.Dao.IContactoDao;
import com.hfierroprog.AgendaSpring.models.Entity.Contacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactoServiceImpl implements IContactoService{

    @Autowired
    private IContactoDao contactoDao; 
    
    @Override
    @Transactional(readOnly = true)
    public List<Contacto> findAll() {
        return (List<Contacto>)contactoDao.findAll();
    }

    @Override
    @Transactional
    public void Save(Contacto contacto) {
        contactoDao.save(contacto);
    }

    @Override
    @Transactional
    public void Delete(Long id) {
        contactoDao.delete(id);
        
    }

    @Override
    @Transactional(readOnly = true)
    public Contacto findOne(Long id) {
        return contactoDao.findOne(id);
    }
    
}
