package eci.edu.cvds.parcialCVDS25_1.servicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Productoo
 * Verifica la creación de productos y toda la gestión del stock
 */
class ProductoTest {

    @Test
    void deberiaCrearProductoCorrectamente() {
        Producto producto = new Producto("Laptop", 1500.0, 10, "Electrónica");

        assertEquals("Laptop", producto.getNombre());
        assertEquals(10, producto.getStock());
    }

    @Test
    void deberiaSerAceptado() {
        Producto producto = new Producto("celular", 2000.0, 10, "Electrónica");

        assertEquals("celular", producto.getNombre());
        assertEquals(10, producto.getStock());
    }

    @Test
    void deberiaPermitirStockCero() {
        Producto producto = new Producto("Mouse", 200.0, 10, "Accesorios");
        
        assertEquals("Mouse", producto.getNombre());
        assertEquals(0, producto.getStock());
    }
    
    @Test
    void secreaCorrectamente() {
        Producto producto = new Producto("audifonos",3000.0, 10, "accesorio");

        assertEquals("audifonos", producto.getNombre());
        assertEquals(10, producto.getStock());
    }

    @Test
    void verificaProductoStock() {
        Producto producto = new Producto("cargador", 5000.0, 10, "accesorio");

        assertEquals("cargador", producto.getNombre());
        assertEquals(10, producto.getStock());
    }
    
}
