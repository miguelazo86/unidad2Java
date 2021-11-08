package unidad2;
import java.util.Scanner;

public class Unidad2 {

    /**
     * @param args the command line arguments
     *  nombre, apellido, edad, hobbie, editor de código preferido, 
     * sistema operativo que utiliza
     */
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su Nombre");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese su Apellido");
        String apellido = sc.nextLine();
        
        System.out.println("Ingrese su hobbie");
        String actividad = sc.nextLine();
        
        System.out.println("Ingrese su Editor de codigo favorito");
        String editFav = sc.nextLine();
        
        System.out.println("Ingrese su Sistema Operativo");
        String opeSis = sc.nextLine();
        
        System.out.println("Ingrese su Edad");
        int edad = sc.nextInt();
    
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        System.out.println("************************************");
        System.out.println("Tu Nombre es: " + nombre);
        System.out.println("");
        System.out.println("Tu Apellido es: " + apellido);
        System.out.println("");
        System.out.println("Tu Edad es: " + edad);
        System.out.println("");
        System.out.println("Tu Hobbie es: " + actividad);
        System.out.println("");
        System.out.println("Tu Editor favorito es: " + editFav);
        System.out.println("");
        System.out.println("Tu Sistema Operativo es: " + opeSis);
        System.out.println("");
        System.out.println("************************************");
    }
    
}
