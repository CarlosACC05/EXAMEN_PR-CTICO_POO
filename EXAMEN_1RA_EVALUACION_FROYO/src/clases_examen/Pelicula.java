/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

import javax.swing.JOptionPane;

public class Pelicula {
    private String titulo;
    private String estudio;
    private int edad;
   
                
    
    public String getTitulo(){
        return titulo;
    }         
    public String getEstudio(){
        return titulo;
    }         
    public int getEdad(){
        return edad;
    }         
    public void setTitulo(String peli){
        titulo = peli;
        
    }
    public void setEstudio(String peli){
        estudio = peli;
    }
    public void setEdad(int peli){
        edad = peli;
    }
    public void ImprimirDatos(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Estudio: " + estudio);
        System.out.println("Edad Permitida: " + edad);
    }
    public void EdadLimite(){
        int age;
        age = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es tu edad ?"));
        if(age >= edad){
            System.out.println("Puedes ver la pelicula");
            
        }else{
            System.out.println("No puedes ver la pelicula");
        }
    }
}