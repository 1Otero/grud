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
@Table(name="tabla_pqr")
public class Pqr implements Serializable{
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="tipo_pqr")
    private String tipo_pqr;
    
    @Column(name="nombre_usuario")
    private String nombre_usuario;
    
    @Column(name="correo_usuario")
    private String ccrreo_usuario;
    
    @Column(name="celular")
    private Integer cel_usuario;
    
    @Column(name="fecha")
    private String fecha;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo_pqr() {
        return tipo_pqr;
    }
    public void setTipo_pqr(String tipo_pqr) {
        this.tipo_pqr = tipo_pqr;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getCcrreo_usuario() {
        return ccrreo_usuario;
    }
    public void setCorreo_usuario(String ccrreo_usuario) {
        this.ccrreo_usuario = ccrreo_usuario;
    }

    public Integer getCel_usuario() {
        return cel_usuario;
    }
    public void setCel_usuario(Integer cel_usuario) {
        this.cel_usuario = cel_usuario;
    }
    
    public String getFecha(){
        return this.fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha; 
    }
    
    
}
