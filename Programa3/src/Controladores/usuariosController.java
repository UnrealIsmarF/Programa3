/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.usuariosModel;
import Vistas.frmPrincipal;
import Vistas.frmUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ismar
 */
public class usuariosController implements ActionListener{
frmPrincipal VistaPrincipal;
frmUsuarios VistaUsuarios;
usuariosModel ModeloUsuarios;
public DefaultTableModel TablaUsuarios = new DefaultTableModel();    
//LEVANTAR DE FORMA AUTOMATICA EL FORMULARIO PRINCIPAL
//-----------------------------------------------------

    public usuariosController(frmPrincipal VistaPrincipal, frmUsuarios VistaUsuarios, usuariosModel ModeloUsuarios) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaUsuarios = VistaUsuarios;
        this.ModeloUsuarios = ModeloUsuarios;
        
        this.TablaUsuarios.addColumn("Apellidos");
        this.TablaUsuarios.addColumn("Nombres");
        this.TablaUsuarios.addColumn("Telefono");
           
           this.VistaUsuarios.jtUsuarios.setModel(TablaUsuarios);
        //PONER A LA ESCUCHA LOS BOTONES CORRESPONDIENTES
        this.VistaPrincipal.btnAgregar.addActionListener(this);
        //levantar vista 
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnAgregar)
        {
        //poner escucha botones
            this.VistaUsuarios.btnInsertar.addActionListener(this);
        //levantar vista de usuarios
            this.VistaUsuarios.setLocationRelativeTo(null);
            this.VistaUsuarios.setVisible(true);
        }
        if(e.getSource() == this.VistaUsuarios.btnInsertar)
       {
           this.ModeloUsuarios.AgregarUsuarios(this.VistaUsuarios.txtApellidos.getText(),
           this.VistaUsuarios.txtNombre.getText(), this.VistaUsuarios.txtTelefono.getText());
           
           this.TablaUsuarios.addRow(new Object[]{this.ModeloUsuarios.ListaUsuarios.get(0).getApellidos(),
               this.ModeloUsuarios.ListaUsuarios.get(0).getNombre(), this.ModeloUsuarios.ListaUsuarios.get(0).getTelefono()});

       }
    
    }
    
}
