/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

public class Password {
    private String usuario;
    private String password;
    
     public Password() {
        usuario = "";
        password = "";
    }
     public Password(String user,String contra) {
        usuario = user;
        password = contra;
    }

    public void setUsuario(String val) {
        usuario = val;
    }

    public void setPassword(String val) {
        password = val;
    }

    public boolean verificarAcceso(String Usuario, String contraseña) {

        return (usuario.equals(Usuario)) && (password.equals(contraseña));
        
        
        
    }
}
