/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import modelo.Producto;

/**
 *
 * @author truji
 */
public class ProductoBuilder {
    
    private Producto producto;
    
    private ProductoBuilder(){
        producto = new Producto();
    }
    
    public static ProductoBuilder builder(){
        return new ProductoBuilder();
    }
    
    public ProductoBuilder id(Integer id){
        producto.setId(id);
        return this;
    }
    
    public ProductoBuilder nombreProducto(String nombreProducto){
      producto.setNombre_producto(nombreProducto);
      return this;
    }
    
    public ProductoBuilder FechaIngreso(String fechaIngreso){
      producto.setFecha(fechaIngreso);
      return this;
    }
    
    public ProductoBuilder cantidad(Integer cantidad){
       producto.setCantidad(cantidad);
       return this;
    }
    
    public ProductoBuilder tipo(String tipo){
      producto.setTipo(tipo);
      return this;
    }
    
    public ProductoBuilder valor(Integer valor){
        producto.setValor(valor);
        return this;
    }
    
    public Producto build(){
        return producto;
    } 
}
