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
    void deberiaPermitirStockCero() {
        Producto producto = new Producto("Mouse", 20.0, 0, "Accesorios");

        assertEquals(0, producto.getStock());
    }
}
