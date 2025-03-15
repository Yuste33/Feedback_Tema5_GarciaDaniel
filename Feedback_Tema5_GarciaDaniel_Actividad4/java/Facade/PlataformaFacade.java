package Facade;

//Clase Facade para simplificar la interaccion con el subsistema
public class PlataformaFacade {
    private final ModuloIA ia = new ModuloIA();
    private final ModuloNotificaciones noti =new ModuloNotificaciones();

    void optimizarProyecto(){
        ia.analizarDatos();
        noti.enviarAlerta();
    }
}
