/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.inventario;
public class Comida {
    private String codigoBarras;
    private String marca;
    private double precio;
    private String tamaño;
    private String comidaEspecial;
    private String descripcion;
    private String cantidad;

    public Comida(String codigoBarras, String marca, double precio, String tamaño, String comidaEspecial, String descripcion, String cantidad) {
        this.codigoBarras = codigoBarras;
        this.marca = marca;
        this.precio = precio;
        this.tamaño = tamaño;
        this.comidaEspecial = comidaEspecial;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }
    
}
