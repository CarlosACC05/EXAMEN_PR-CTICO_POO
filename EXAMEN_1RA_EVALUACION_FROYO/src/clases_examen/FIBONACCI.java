/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

public class FIBONACCI {
     private int a1;
    private int a2;
    private int n;
    
    // Constructor sin parámetros
    public FIBONACCI() {
        a1 = 1;
        a2 = 1;
        n = 6;
    }
    
    // Constructor con parámetros
    public FIBONACCI(int val1, int val2, int n1) {
        a1 = val1;
        a2 = val2;
        n = n1;
    }
    
    // Método para obtener el valor de a1
    public int getA1() {
        return a1;
    }
    
    // Método para establecer el valor de a1
    public void setA1(int val1) {
        a1 = val1;
    }
    
    // Método para obtener el valor de a2
    public int getA2() {
        return a2;
    }
    
    // Método para establecer el valor de a2
    public void setA2(int val2) {
        a2 = val2;
    }
    
    // Método para obtener el valor de n
    public int getN() {
        return n;
    }
    
    // Método para establecer el valor de n
    public void setN(int n1) {
        n = n1;
    }
    
    // Método para calcular la serie de Fibonacci y guardar los resultados en un array
   
    
    // Método para imprimir la serie de Fibonacci
    public void imprimirSerie() {
        int n1 = a1;
        int n2 = a2;
        int n3;
        
        System.out.print(n1 + " " + n2 + " ");
        
        for (int i = 0; i < (n-2);i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n3 + n2;
            i++;
            if(i<(n-2)){
            System.out.print(n1 + " ");}
            n2 = n1 + n3;
            i++;
            if(i<(n-2)){
            System.out.print(n2 + " ");}
          
        }
        System.out.println("");
    }
}
