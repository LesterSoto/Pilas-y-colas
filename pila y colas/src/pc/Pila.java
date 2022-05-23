package pc;
import lse.Nodo;

public class Pila extends Cola{
    @Override
    public void eliminar() {
        if (!estaVacio()){
            Nodo ultimo = primeiro;
            Nodo penultimo = null;
            while (ultimo.getSiguiente() != null){
                penultimo=ultimo;
                ultimo = ultimo.getSiguiente();
            }
            penultimo.setSiguiente(null);

        }
    }
}
