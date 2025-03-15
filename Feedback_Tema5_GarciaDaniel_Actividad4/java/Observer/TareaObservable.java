package Observer;


import java.util.ArrayList;
import java.util.List;

//Mantiene una lista de observadores y los notifica
public class TareaObservable {
    private final List<Observador> observadores =new ArrayList<>();
    void agregarObserbador(Observador observador){
        observadores.add(observador);
    }
    void notificarObservadores(String mensaje){
        for(Observador o : observadores){
            o.actualizar(mensaje);
        }
    }
}
