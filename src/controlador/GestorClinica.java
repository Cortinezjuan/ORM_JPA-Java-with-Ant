/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import persistencia.ConfigHibernate;

/**
 *
 * @author Docente
 */
public class GestorClinica extends Gestor {

    public GestorClinica() {
        sesion = ConfigHibernate.openSession();
    }
}
