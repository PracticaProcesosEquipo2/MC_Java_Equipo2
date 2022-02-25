/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Stevia
 */
import Modelo.MDB;
import Vista.FrmSeguimientoClientes;
import Vista.FrmVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SeguimientoClientes implements ActionListener{
  private FrmSeguimientoClientes _view; //el formulario 
  private MDB _model;//el manejador de bases de datos

    
    public SeguimientoClientes(FrmSeguimientoClientes view, MDB model){
       this._model=model;
       this._view=view;
        this._view.cmdAlta.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
}
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.cmdAlta){ //Si el botón presionado fue el de alta
         // System.out.print("paso");
        //leyenda=_model.registrarAlta("seguimiento_clientes"," null, " +_view.txtCedula.getText()+" ,' " +_view.txtLugar.getText() +" ',' "+_view.txtNombreCompleto.getText()+" ',' "+_view.txtProfesion.getText()+" ',' "+_view.txtDirecionResidencial.getText()+" ',' "+_view.txtCiudad.getText()+" ',' "+_view.txtDepartamento.getText()+" ',' "+_view.txtEmail.getText()+" ', "+_view.txtTel_Residencia.getText()+" , "+_view.txtTel_Trabajo.getText()+" , "+_view.txtNum_Factura.getText()+" , ' "+_view.txtTipoCartera.getText()+" ', '"+_view.txtFechaMora.getText()+" ', "+_view.txtDiasMora.getText()+" , "+_view.txtValMora.getText()+" , "+_view.txtV_seguro.getText()+" , "+_view.txtInt_mora.getText()+" ', "+_view.txtNombreCompleto.getText()+" ', "+_view.txtV_seguro.getText()+" ', "+_view.txtInt_mora.getText()+" , "+_view.txtSaldo_restante.getText()+" ,' "+_view.txtTipo_cobro.getText()+" ',' "+_view.txtFecha_Acuerdo_Uno.getText()+" ',' "+_view.txtAcuerdo_Uno.getText()+" ',' "+_view.txtFecha_Acuerdo_Dos.getText()+" ',' "+_view.txtAcuerdo_Dos.getText()+" ',' "+_view.txtFATres.getText()+" ',' "+_view.txtATres.getText()+" ',' "+_view.txtFACuatro.getText()+" ',' "+_view.txtACuatro.getText() );
        leyenda = _model.registrarAlta("seguimiento_clientes", _view.txtId.getText()+" ,"+_view.txtCedula.getText()+" ,'"+_view.txtLugar.getText()+"','"+_view.txtNombreCompleto.getText()+"','"+_view.txtProfesion.getText()+"','"+_view.txtDirecionResidencial.getText()+"','"+_view.txtCiudad.getText()+"','"+_view.txtDepartamento.getText()+"','"+_view.txtEmail.getText()+"',"+_view.txtTel_Residencia.getText()+","+_view.txtTel_Trabajo.getText()+","+_view.txtNum_Factura.getText()+",'"+_view.txtTipoCartera.getText()+"','"+_view.txtFechaMora.getText()+"',"+_view.txtDiasMora.getText()+","+_view.txtValMora.getText()+","+_view.txtV_seguro.getText()+","+_view.txtInt_mora.getText()+","+_view.txtSaldo_restante.getText()+",'"+_view.txtTipo_cobro.getText()+"','"+_view.txtFecha_Acuerdo_Uno.getText()+"','"+_view.txtAcuerdo_Uno.getText()+"','"+_view.txtFecha_Acuerdo_Dos.getText()+"','"+_view.txtAcuerdo_Dos.getText()+"','"+_view.txtFATres.getText()+"','"+_view.txtATres.getText()+"','"+_view.txtFACuatro.getText()+"','"+_view.txtACuatro.getText()+"'");
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
       System.out.print (leyenda);
       JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
    
}
}
public void iniciar(){
_view.setTitle("MVC_Visual");
}
public void limpiar(){
_view.txtTipoCartera.setText(null);
_view.txtFechaMora.setText(null);

_view.txtDiasMora.setText(null);

_view.txtValMora.setText(null);

_view.txtEmail.setText(null);

_view.txtTel_Residencia.setText(null);

_view.txtTel_Trabajo.setText(null);

_view.txtNum_Factura.setText(null);
_view.txtProfesion.setText(null);

_view.txtProfesion.setText(null);

_view.txtCiudad.setText(null);
_view.txtFecha_Acuerdo_Uno.setText(null);
_view.txtFecha_Acuerdo_Dos.setText(null);
_view.txtFATres.setText(null);

_view.txtACuatro.setText(null);
_view.txtId.setText(null);
_view.txtCedula.setText(null);
_view.txtLugar.setText(null);
_view.txtNombreCompleto.setText(null);
_view.txtV_seguro.setText(null);
_view.txtInt_mora.setText(null);

_view.txtSaldo_restante.setText(null);
_view.txtTipo_cobro.setText(null);
_view.txtDirecionResidencial.setText(null);
_view.txtDepartamento.setText(null);

_view.txtAcuerdo_Uno.setText(null);
_view.txtAcuerdo_Dos.setText(null);
_view.txtATres.setText(null);
_view.txtACuatro.setText(null);












}
}