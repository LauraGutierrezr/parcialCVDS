package eci.edu.cvds.parcialCVDS25_1;

import java.util.Map;

import eci.edu.cvds.parcialCVDS25_1.Agents.*;
import eci.edu.cvds.parcialCVDS25_1.Servicios.*;

public class app {
    
    private Map<Producto, Integer> productos;
	private AgenteAdvertencia advertencia;
	private AgenteLog log;


	public boolean modifyStock(Producto producto){
		int stock = productos.get(producto);
		String name = producto.getNombre();
		if (stock <= 5){
			advertencia.notificacion(name, stock);
		}
		log.notificacion(name, stock);

		return true;
	}

}
