/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.empleado.serviceImpl;

import com.example.empleado.entity.Empleado;
import com.example.empleado.repository.EmpleadoRepository;
import com.example.empleado.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BRITNEY
 */
@Service
public class EmpleadoServiceImpl implements EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository; 
    
    @Override
    public Empleado create(Empleado emp) {
        return empleadoRepository.save(emp);
    }

    @Override
    public Empleado update(Empleado emp) {
        return empleadoRepository.save(emp);
    }

    @Override
    public void delete(int id) {
        empleadoRepository.deleteById(id);
    }

    @Override
    public Empleado read(int id) {
       return empleadoRepository.findById(id).get();
    }

    @Override
    public List<Empleado> readAll() {
        return empleadoRepository.findAll();
    }
    
}
