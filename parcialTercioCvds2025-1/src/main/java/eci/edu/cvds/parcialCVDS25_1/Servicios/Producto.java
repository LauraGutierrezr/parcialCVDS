package eci.edu.cvds.parcialCVDS25_1.Servicios;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;
//
    public Producto(String nombre, double precio, int stock, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

}
