/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    private Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public static Producto crearProducto(String nombre, double precio, int stock){
            return new Producto(nombre, precio, stock);
                    }
    
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }
@Deprecated
    public void borrarDatos() {
        nombre = "";
        precio = 0.0;
        stock = 0;
    }
}