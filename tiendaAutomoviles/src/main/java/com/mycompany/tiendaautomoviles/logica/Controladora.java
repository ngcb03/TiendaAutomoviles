package com.mycompany.tiendaautomoviles.logica;

import com.mycompany.tiendaautomoviles.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    private static int idIncremental = 0;
    private static Automovil auto;
    private static Controladora control = null;
    private static final ControladoraPersistencia controlPersis = ControladoraPersistencia.getIntance();

    private Controladora() {
    }
    
    public static Controladora getInstance() {
        if(control == null){
            return (control = new Controladora());
        } return Controladora.control;
    }
    
    public void crearAuto(String modelo, String marca, String motor, String color, String patente, String cantPuertas){
        Controladora.auto = new Automovil(idIncremental, modelo, marca, motor, color, patente, Byte.parseByte(cantPuertas));
        controlPersis.crearAuto(Controladora.auto);
        Controladora.idIncremental++;
    }
    
    public List<Automovil> traerAutos(){
        return (controlPersis.traerAutos());
    }

    public void eliminarAuto(int num_auto) {
        controlPersis.eliminarAuto(num_auto);
    }

    public void editarAuto(int num_auto, String modelo, String marca, String motor, String color, String patente, String cantPuertas) {
        auto = new Automovil(num_auto, modelo, marca, motor, color, patente, Byte.parseByte(cantPuertas));
        controlPersis.editarAuto(auto);
    }

    public Automovil buscarAuto(int num_auto) {
        return (controlPersis.buscarAuto(num_auto));
    }
    
}
