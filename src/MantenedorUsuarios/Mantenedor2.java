package MantenedorUsuarios;

import UsuariosDatos.Usuarios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Mantenedor2 {

    public static void main(String[] args) {
        // Variable para poder leer desde el teclado
        Scanner leer = new Scanner(System.in);
        // Emulamos una Base de Datos tabla usuario
        List<Usuarios> usuarios = new ArrayList<>();        
        System.out.println("Digite la cantidad de usuarios a agregar ");
        Integer cantidad_usuario = leer.nextInt();
        // for recorrer la cantidad y agregar usuarios a la lista.        
        for (int i = 0; i < cantidad_usuario; i++) {
            Usuarios usu = new Usuarios();
            System.out.println("Digite el id del usuario " + (i+1));
            Integer id = leer.nextInt();            
            usu.setId(id);
            System.out.println("Digite el Rut del usuario " + (i+1));
            String run = leer.nextLine();
            usu.setRun(run);
            leer.nextLine();
            System.out.println("Digite el Nombre del usuario " + (i+1));
            String nombre = leer.nextLine();
            usu.setNombre(nombre);
            leer.nextLine();
            System.out.println("Digite el Apellido del usuario " + (i+1));
            String apellido = leer.nextLine();
            usu.setApellido(apellido);
            leer.nextLine();
            System.out.println("Digite la edad del usuario " + (i+1));
            Integer edad = leer.nextInt();
            usu.setEdad(edad);
         
            
            while((edad < 1)||(edad > 120)){
                System.out.println("digite una edad real");
               
               edad = leer.nextInt();
             usu.setEdad(edad);
            
            }
            
            System.out.println("Digite el correo del usuario " + (i+1));
            String correo = leer.nextLine();
            usu.setCorreo(correo);   
            correo = leer.nextLine();
            
            usuarios.add(usu);
            
        }                
        // SOlo se puede edtirar el nombre , apellido y la edad;
        //Valores antes  de editar
        for (Usuarios usuario : usuarios) {
            System.out.println(usuario.toString());
        }
        
        System.out.println("Desea editar algun registro ? S para Si N para NO");
        String respuestaEditar = leer.nextLine();
        if( respuestaEditar.equals("S") ){
           
                System.out.println("Digite la posiscion que quiere editar ");
                Integer posicion = leer.nextInt();                                                                     

                System.out.println("Digite el nuevo nombre ");
                String nuevoNombre = leer.nextLine();            
                usuarios.get(posicion).setRun(nuevoNombre);

                System.out.println("Digite el nuevo apellido ");
                String nuevoApellido = leer.nextLine();           
                usuarios.get(posicion).setApellido(nuevoApellido);  

                 System.out.println("Digite la nueva Edad ");
                Integer nuevaEdad = leer.nextInt();           
                usuarios.get(posicion).setEdad(nuevaEdad);                            
            // preguntar la posicion a editar
            
            
           
        } 
        System.out.println("Desea eliminar algun registro ? S para Si N para NO");
        String respuestaEliminar = leer.nextLine();
        if( respuestaEliminar.equals("S") ){


        }
        //Valores despues de editar
        for (Usuarios usuario : usuarios) {
            System.out.println(usuario.toString());
        }
        
        
    } 
}

    

