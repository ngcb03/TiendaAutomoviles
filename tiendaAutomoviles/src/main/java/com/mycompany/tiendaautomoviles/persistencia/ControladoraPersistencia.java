package com.mycompany.tiendaautomoviles.persistencia;

import com.mycompany.tiendaautomoviles.logica.Automovil;
import com.mycompany.tiendaautomoviles.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {

    private static ControladoraPersistencia controlPersis = null;
    private static final AutomovilJpaController autoJpa = AutomovilJpaController.getInstance();
    
    private ControladoraPersistencia() {
    }
    
    public static ControladoraPersistencia getIntance() {
        if(controlPersis == null){
            return (controlPersis = new ControladoraPersistencia());
        } return null;
    }

    public void crearAuto(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();
    }

    public void eliminarAuto(int num_auto) {
        try {
            autoJpa.destroy(num_auto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil buscarAuto(int num_auto) {
        return (autoJpa.findAutomovil(num_auto));
    }

    
}
