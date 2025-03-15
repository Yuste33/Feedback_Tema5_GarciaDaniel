package FactoryMethod;

//Clase Factory que crea objetos de tipo Tarea segun el tipo recibido
public class TareaFactory{
    public static Tarea crearTarea(String tipo){
        return switch (tipo){
            case "desarrollo"->new TareaDesarrollo();
            case "pruebas"->new TareaPruebas();
            default -> throw new IllegalArgumentException("No se encontro ese tipo");
        };
    }
}
