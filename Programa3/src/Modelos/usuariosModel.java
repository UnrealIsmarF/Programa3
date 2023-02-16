/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author ismar
 */
public class usuariosModel {
public ArrayList<Usuarios> ListaUsuarios = new ArrayList<Usuarios>();
    
public void AgregarUsuarios(String apellidos, String nombre, String telefono)
{
    Usuarios NuevoUsuario = new Usuarios(apellidos, nombre, telefono);
    this.ListaUsuarios.add(NuevoUsuario);
}

public ArrayList ListarUsuarios()
{
    return ListaUsuarios;
}

}
