/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.Classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Tadeu
 */
public class Conexao {
    protected EntityManagerFactory emf= Persistence.createEntityManagerFactory("DentalSIS_PU");
    protected EntityManager em= emf.createEntityManager();
    protected Query query;
}
