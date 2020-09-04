/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.ejb;

import com.test.entidades.Producto;
import com.test.servicio.ProductoFacadeLocal;
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
public class ProductoBean {

    @EJB
    private ProductoFacadeLocal productoFacade;
       
    public List<Producto>getProducto(){
    
        return this.productoFacade.findAll();
    
    }
    
    
    public ProductoBean(){
    
    }
    
    
    
}
