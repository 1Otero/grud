/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author truji
 */
@Entity
@Table(name= "tabla_productos")
public class Producto implements Serializable{
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="nombre_producto", length= 45, nullable=false)
    private String nombre_producto;
    
    @Column(name="tipo", length=44, nullable=false)
    private String tipo;
    
    @Column(name="fecha_ingreso",length=43, nullable=false)
    private String fecha_ingreso;
    
    @Column(name="valor",length=30, nullable=false)
    private Integer valor;
    
    @Column(name="cantidad",length=44,nullable=false)
    private Integer cantidad;
    
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getNombre_producto(){
        return this.nombre_producto;
    }
    public void setNombre_producto(String nombre_producto){
        this.nombre_producto = nombre_producto;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getFecha(){
        return this.fecha_ingreso;
    }
    public void setFecha(String fecha_ingreso){
        this.fecha_ingreso = fecha_ingreso;
    }
    
    public Integer getValor(){
        return this.valor;
    }
    public void setValor(Integer valor){
        this.valor = valor;
    }
    
    public Integer getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }
    
}

