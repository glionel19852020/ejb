/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.ejb;

import com.test.entidades.Producto;
import com.test.servicio.ProductoFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author GERSON
 */

@Named("productobean")
@RequestScoped
public class ProductoBean implements Serializable{
    

    @EJB
    private ProductoFacadeLocal productoFacade;
    private Producto newproduct;

   
    public Producto getNewproduct() {
        if(newproduct==null){
            
            newproduct = new Producto();
        
        }
            return newproduct;
    }

        
    public void setNewproduct(Producto newproduct) {
        this.newproduct = newproduct;
    }
    
       
    public ProductoBean(){
    
    }
               
    public List<Producto>getProducto(){
    
        return this.productoFacade.findAll();
    
    }
    
    public void crear(){
    
        this.productoFacade.create(newproduct);
    
    }
    
    public void Eliminar(Producto producto){
    
        this.productoFacade.remove(producto);
    }
    
    
    public void Actualizar(Producto producto){
    
        this.productoFacade.edit(producto);
    
    }
    
    
    
    
}
