package com.example.empleado.controller;

import com.example.empleado.entity.Empleado;
import com.example.empleado.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BRITNEY
 */
@RestController
@RequestMapping("/emp")
public class EmpleadoRestController {
    @Autowired
    private EmpleadoService empleadoService;
    
    @GetMapping("/all")
    public List<Empleado>getPosts(){
        return empleadoService.readAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Empleado> getEmpleado(@PathVariable int id){
        Empleado emp=empleadoService.read(id);
        return ResponseEntity.ok(emp);
    }
    
    @DeleteMapping("/{id}")
    public void deleteEmpleado(@PathVariable int id){
        empleadoService.delete(id);
    }
    
    @PostMapping("/add")
    public Empleado addEmpleado(@RequestBody Empleado emp){
        return empleadoService.create(emp);
    }
    
    @PutMapping("/edit")
    public Empleado editEmpleado(@RequestBody Empleado emp){
        Empleado em =new Empleado(emp.getId(),emp.getNombres(),emp.getApellidos(),emp.getDni());
        System.out.println(emp.getId()+" , "+emp.getNombres()+" , "+emp.getApellidos()+" , "+emp.getDni());
        return empleadoService.update(emp);
    }
}
