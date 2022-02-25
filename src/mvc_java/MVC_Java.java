/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_java;

import Controlador.ControladorClientes;
import Controlador.ControladorMDB;
import Controlador.SeguimientoClientes;
import Modelo.MDB;
import Vista.FrmClientes;
import Vista.FrmSeguimientoClientes;
import Vista.FrmVista;

/**
 *
 * @author Stevia
 */
public class MVC_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MDB objModelo=new MDB();
        FrmVista objVista=new FrmVista();
        ControladorMDB objController;
        
      
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
        
        FrmClientes objClientes = new FrmClientes();
        ControladorClientes objConClientes;
        
        objConClientes = new ControladorClientes(objClientes, objModelo);
        objConClientes.iniciar();
        objClientes.setVisible(true);
        
        FrmSeguimientoClientes objSegClientes = new FrmSeguimientoClientes();
        SeguimientoClientes objConSeguimiento;
        
        objConSeguimiento = new SeguimientoClientes(objSegClientes, objModelo);
        objConSeguimiento.iniciar();
        objSegClientes.setVisible(true);
        
    }
    
}
