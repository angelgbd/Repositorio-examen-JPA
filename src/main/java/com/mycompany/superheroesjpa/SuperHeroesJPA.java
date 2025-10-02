/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superheroesjpa;

import DAO.ISuperHeroeDAO;
import DAO.SuperHeroeDAO;
      
/**
 *
 * @author Laboratorios
 */
public class SuperHeroesJPA {

    public static void main(String[] args) {
        ISuperHeroeDAO dao = new SuperHeroeDAO();
        
        // INSERTAR SUPERHEROES
        SuperHeroe spiderman = new SuperHeroe(
                "Spider-Man",
                Universo.MARVEL,
                new IdentidadSecreta("Peter Parker","New York", "Fotografo"),
                "Con gran poder viene una gran responsabilidad"
        );
        
        SuperHeroe batman = new SuperHeroe(
                "Batman",
                Universo.DC,
                new IdentidadSecreta("Bruce Wayne","Gotham", "Empresario"),
                "Soy la venganza"
        );
        
        SuperHeroe goku = new SuperHeroe(
                "Goku",
                Universo.INDEPENDIENTE,
                new IdentidadSecreta("Kakarotto","Planeta Tierra", "Guerrero"),
                "Kamehameha"
        );
        
      dao.insertar(spiderman);
      dao.insertar(batman);
      dao.insertar(goku);
      
      // Listar los superHeroes
        System.out.println("Lista inicial de superheroes");
        dao.listar().forEach(h -> System.out.println(h.getId() + " - " + h.getNombre() + h.getIdentidadSecreta().getCiudad()));
        
        
        SuperHeroe batmanBD = dao.buscar(batman.getId());
        batmanBD.getIdentidadSecreta().setCiudad("Ciudad Gotica");
        dao.actualizar(batmanBD);
        
        System.out.println("Lista despues de actualizar batman");
        dao.listar().forEach(h -> System.out.println(h.getId() + " - " + h.getNombre() + h.getIdentidadSecreta().getCiudad()));
        
        dao.eliminar(spiderman.getId());
        
        System.out.println("Lista inicial de superheroes");
        dao.listar().forEach(h -> System.out.println(h.getId() + " - " + h.getNombre()));
    }
}
