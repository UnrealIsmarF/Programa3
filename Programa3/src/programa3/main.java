/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa3;

import Controladores.usuariosController;
import Modelos.usuariosModel;
import Vistas.frmPrincipal;
import Vistas.frmUsuarios;

/**
 *
 * @author ismar
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal  VistaPrincipal = new frmPrincipal();
        frmUsuarios VistaUsuarios = new frmUsuarios(VistaPrincipal, true);
        usuariosModel ModeloUsuarios = new usuariosModel();
        
        usuariosController ControladorUsuarios = new usuariosController(VistaPrincipal, VistaUsuarios, ModeloUsuarios);
    }
    
}
