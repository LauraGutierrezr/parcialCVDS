package eci.edu.cvds.parcialCVDS25_1.Agents;

import eci.edu.cvds.parcialCVDS25_1.Servicios.*;


public class AgenteLog implements Agente{
    @Override
    public void notificacion(String name, int stock) {
        System.out.println("Producto: " + name + " -> " + stock + " unidades disponibles");
    }
}


