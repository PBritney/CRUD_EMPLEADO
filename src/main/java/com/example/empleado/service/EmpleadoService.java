/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.empleado.service;

import com.example.empleado.entity.Empleado;
import java.util.List;

/**
 *
 * @author BRITNEY
 */
public interface EmpleadoService {
    Empleado create (Empleado emp);
    Empleado update (Empleado emp);
    void delete (int id);
    Empleado read(int id);
    List<Empleado>readAll();
}
