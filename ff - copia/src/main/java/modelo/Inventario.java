/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author truji
 */
@Entity
@Table(name="tabla_inventario")
public class Inventario implements Serializable{
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  
    
    @Column(name="nombre_producto")
    private String nombre;
    
    @Column(name="precio")
    private Integer precio;
    
    @Column(name="cantidad")
    private Integer cantidad;
    
    @Column(name="fecha")
    private Integer fecha;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCatidad(){
        return this.cantidad;
    }
    public void setCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }
      
    public Integer getFecha() {
        return fecha;
    }
    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }
    
    
    
}
