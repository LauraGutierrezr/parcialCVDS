package eci.edu.cvds.parcialCVDS25_1.Agents;

import eci.edu.cvds.parcialCVDS25_1.Servicios.*;

public class AgenteAdvertencia {
    public void notificacion(String name, int stock) {
            System.out.println("ALERTA!!! El stock del Producto: " + name + " es muy bajo, solo quedan " + stock + " unidades.");
        }
    
}
