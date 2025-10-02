/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import com.mycompany.superheroesjpa.SuperHeroe;
import java.util.List;

/**
 *
 * @author Laboratorios
 */
public interface ISuperHeroeDAO {
    
    void insertar(SuperHeroe e);
    
    void actualizar(SuperHeroe e);
    
    void eliminar(Long id);
    
    SuperHeroe buscar(Long id);
    
    List<SuperHeroe> listar();
    
    
}
