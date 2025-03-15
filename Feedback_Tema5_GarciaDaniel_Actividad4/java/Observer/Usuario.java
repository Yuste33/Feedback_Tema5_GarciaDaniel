package Observer;

//Observador concreto recibe y muestra las notificaciones
public class Usuario implements Observador{
    private final String nombre;
    Usuario(String nombre){
        this.nombre=nombre;
    }
    public void actualizar(String mensaje){
        System.out.println(nombre+" recibio: "+mensaje);
    }
}
