/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/**
 *
 * @author carlo
 */
public class DatosIntegrantes {
    private static final String nombreEquipo = "Froyo";
    //Metodo estatico con constructor
    public static void imprimirDatosEquipo(String numeroControl, String carrera, String nombre, String apellidos) {

        System.out.println("Nombre del Equipo: " + nombreEquipo);
        System.out.println("Número de control: " + numeroControl);
        System.out.println("Carrera: " + carrera);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
    }
    //Metodo estatico para imprimir
    public static void imprimirProblemasResueltos() {
        System.out.println("DATOS DEL EQUIPO");
        DatosIntegrantes.imprimirDatosEquipo("22550358","ISC","Miguel Ángel","Caballero Peña");
        System.out.println("");
        DatosIntegrantes.imprimirDatosEquipo("22550332","ISC","Carlos Alberto","Carrillo Cancino");
        System.out.println("");
        DatosIntegrantes.imprimirDatosEquipo("22550311","ISC","Erick Alejandro","Martinez Martinez");
        
        System.out.println("-----------------------------------");
        
        System.out.println("CLASE CONTRASEÑA");
        Password contrasena1 = new Password();
        contrasena1.setUsuario("Lolazo");
        contrasena1.setPassword("12345");
        
        System.out.println(contrasena1.verificarAcceso("Lolazo","12345"));
        System.out.println(contrasena1.verificarAcceso("dios", "mio"));
        
        Password contrasena2 = new Password("pablo","567");
        
        System.out.println(contrasena2.verificarAcceso("pablo", "567"));
        System.out.println(contrasena2.verificarAcceso("zelda", "123"));
        
        System.out.println("-----------------------------------");
        
        System.out.println("CLASE CUENTA BANCARIA");
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        
        cuenta1.setNombreCliente("Sebastian");
        cuenta1.setNumeroCuenta("5452345235");
        cuenta1.depositarEnCuenta(500);
        cuenta1.retirarDeCuenta(400);
        cuenta1.imprimirDatos();
        
        System.out.println("");
        
        CuentaBancaria cuenta2 = new CuentaBancaria("6924689024","Dio",1000000);
        cuenta2.depositarEnCuenta(5);
        cuenta2.retirarDeCuenta(500000);
        cuenta2.imprimirDatos();
        
        System.out.println("-----------------------------------");
        
        System.out.println("CLASE PELICULA");
        
        Pelicula funcion = new Pelicula();
        funcion.setTitulo("Paul");
        funcion.setEstudio("MTZBROS");
        funcion.setEdad(15);
        funcion.ImprimirDatos();
        funcion.EdadLimite();
        
        System.out.println("-----------------------------------");
        
        System.out.println("FIBONACCI");
        FIBONACCI fibonacci1 = new FIBONACCI();
        FIBONACCI fibonacci2 = new FIBONACCI(2,5,6);
        FIBONACCI fibonacci3 = new FIBONACCI();

        fibonacci3.setA1(5);
        fibonacci3.setA2(7);
        fibonacci3.setN(8);
        
        fibonacci1.imprimirSerie();
        fibonacci2.imprimirSerie();
        fibonacci3.imprimirSerie();
        System.out.println("");
        
    }
}
