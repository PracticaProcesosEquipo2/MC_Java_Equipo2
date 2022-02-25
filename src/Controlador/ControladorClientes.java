/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Chema
 */

import Modelo.MDB;
import Vista.FrmClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorClientes implements ActionListener {
    private FrmClientes _view;
    private MDB _model;

    public ControladorClientes(FrmClientes view, MDB model){
        this._model = model;
        this._view = view;
        this._view.cmdAgregar.addActionListener(this);
        this._view.cmdEliminar.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String leyenda = "";
        if(e.getSource()==_view.cmdAgregar){
            leyenda =_model.registrarAlta("clientes", "null, ' "+ _view.txtCiudad.getText()+" ',' "+ _view.txtDepartamento.getText()+" ',' "+ _view.txtDireccion_Residencial.getText()+" ',' "+ _view.txtEmail.getText()+" ',' "+ _view.txtFecha_Credito.getText()+" ',' "+ _view.txtLugarEx.getText()+" ',' "+ _view.txtNCuotas.getText()+" ',' "+ _view.txtNom.getText()+" ',' "+ _view.txtNum_Factura.getText()+" ',' "+ _view.txtProfesion.getText()+" ',' "+ _view.txtTCartera.getText()+" ',' "+ _view.txtTel_Residencia.getText()+" ',' "+ _view.txtTel_Trabajo.getText()+" ',' "+ _view.txtVCartera.getText()+" ',' ");
            System.out.println(leyenda);
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
    }
    
    public void iniciar(){
        _view.setTitle("MVC Visual");
    }
    
    public void limpiar(){
        _view.txtCiudad.setText(null);
        _view.txtDepartamento.setText(null);
        _view.txtDireccion_Residencial.setText(null);
        _view.txtEmail.setText(null);
        _view.txtFecha_Credito.setText(null);
        _view.txtLugarEx.setText(null);
        _view.txtNCuotas.setText(null);
        _view.txtNom.setText(null);
        _view.txtNum_Factura.setText(null);
        _view.txtProfesion.setText(null);
        _view.txtTCartera.setText(null);
        _view.txtTel_Residencia.setText(null);
        _view.txtTel_Trabajo.setText(null);
        _view.txtVCartera.setText(null);
    }
    
}
