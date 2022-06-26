package MantenedorUsuarios;

import UsuariosDatos.Usuarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mantenedor {
   
    
public static void main(String[]args){
    
    //variable para poder leer desde consola
    
Scanner leer = new Scanner(System.in);

    //emulamos una base de datos *tabla usuarios*
    
List<Usuarios> usuarios = new ArrayList<>();

Integer cantidad_usuarios,contador;
System.out.println(" EMPRESAS GLOBEX CONECTANDO A UN MUNDO MEJOR ");
System.out.println("Por favor digite la cantidad de trabajadores del area producción que desea agregar (máximo 100)");

cantidad_usuarios = leer.nextInt();

if (cantidad_usuarios > 100){
System.out.println("¡Excede el maximo de trabajadores a registrar!");
System.out.println("por favor digite una cantidad maxima de 100 trabajadores");
cantidad_usuarios = leer.nextInt();
}
else{
System.out.println("Bienvenido");
}
    // se utiliza el metodo *for* para recorrer la lista y agregar usuarios
   
for (int i = 0; i <cantidad_usuarios; i++){
Usuarios user = new Usuarios();
System.out.println("Digite la ID del trabajador " + (i+1));
Integer id = leer.nextInt();
user.setId(id);
   
System.out.println("Digite el Nombre del trabajador " + (i+1));
String nombre = leer.nextLine();
nombre = leer.nextLine();
user.setNombre(nombre);
    
System.out.println("Digite el Apellido del trabajador " + (i+1));
String apellido = leer.nextLine();
user.setApellido(apellido);
    
System.out.println("Digite el Run del trabajador " + (i+1));
String run = leer.nextLine();
user.setRun(run);
   
System.out.println("Digite la Edad del trabajador " + (i+1));
Integer edad = leer.nextInt();
user.setEdad(edad);

   // fijamos un limite de rango de edad
   
while((edad < 18)||(edad > 65)){
System.out.println(" ¡Error! digite una edad real *entre 18 y 65 años* ");
edad = leer.nextInt();
user.setEdad(edad);
}            

System.out.println("Digite el Correo electronico del rabajador" + (i+1));
leer.nextLine();
String correo = leer.nextLine();
user.setCorreo(correo);

usuarios.add(user);

}

   //recordatorio: *solo se pueden editar "el nombre, apellido y la edad (String)
   //valores antes de editar
  
System.out.println("¿Desea editar el registro de algun trabajador? pulse *S* para sí o pulse *N* para no");
String respuestaEditar = leer.nextLine();
if(respuestaEditar.equals("s")){
  
System.out.println("Digite la posición de registro de trabajador que quiere editar");
Integer posicion = leer.nextInt();
    
System.out.println("Digite el nuevo Nombre");
String nuevoNombre = leer.nextLine();
nuevoNombre = leer.nextLine();
usuarios.get(posicion).setNombre(nuevoNombre);
 
System.out.println("Digite el nuevo Apellido");
String nuevoApellido = leer.nextLine();
usuarios.get(posicion).setApellido(nuevoApellido);
    
System.out.println("Digite la nueva Edad");
Integer nuevaEdad = leer.nextInt();
usuarios.get(posicion).setEdad(nuevaEdad);
}
   //preguntamos la posicion a editar
  
for (Usuarios usuario : usuarios){
System.out.println(usuarios.toString());
}
  
System.out.println("¿Desea eliminar algun trabajador del registro? Digite *S* para si  *N* para no");
usuarios.remove(leer.nextLine());
String respuestaEliminar = leer.nextLine();
if (respuestaEliminar.equals("s")){

System.out.println("Digite la posicion de registro del trabajador a eliminar");
usuarios.remove(leer.nextInt());
System.out.println("nueva lista corregida");
for(Usuarios usuario : usuarios){
System.out.println(usuarios.toString());
}
}
else{
System.out.println("trabajador añadido a la base de datos");
}
}
}   


