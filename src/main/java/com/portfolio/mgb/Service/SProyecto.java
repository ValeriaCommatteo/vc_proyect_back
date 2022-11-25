/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Entity.Proyecto;
import com.portfolio.mgb.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SProyecto {
    @Autowired
    RProyecto Rproyecto;
    
     public List<Proyecto> list(){
        return Rproyecto.findAll();
    }
    
    public Optional<Proyecto> getOne (int id){
        return Rproyecto.findById(id);
    }
    
    public Optional<Proyecto> getByNombreP(String nombreP){
        return Rproyecto.findByNombreP(nombreP);
    }
    
    public void save (Proyecto proyecto){
        Rproyecto.save(proyecto);
    }
    
    public void delete(int id){
        Rproyecto.deleteById(id);
    }
    
    public boolean existsById(int id){
        return Rproyecto.existsById(id);
    }
    
    public boolean existsByNombreP(String nombreP){
        return Rproyecto.existsByNombreP(nombreP);
    }
}
