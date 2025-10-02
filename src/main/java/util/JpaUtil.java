/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Laboratorios
 */
public class JpaUtil {
    private static final String PERSISTENCE_UNIT = "SuperHeroesPU";
    private static EntityManagerFactory emf;

    public JpaUtil() {
    }
    
    public static EntityManager getEntityManager(){
        if(emf == null) {
           emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);    
        }
        return emf.createEntityManager();
    }
}
