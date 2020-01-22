/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.taller.main;

import ec.com.taller.conexion.ConexionMySql;

/**
 *
 * @author Efrain
 */
public class ServiciosAutomotrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola mundo.. aqui inicia todo");
        try{
            ConexionMySql.obtener();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("salio conexion");
    }
    
}
