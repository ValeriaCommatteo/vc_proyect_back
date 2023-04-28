/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.valcommatteo.Security.Service;

import com.portfolio.valcommatteo.Security.Entity.Rol;
import com.portfolio.valcommatteo.Security.Enums.RolNombre;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.valcommatteo.Security.Repository.IRolRepository;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolrepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolrepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolrepository.save(rol);
    }
}
