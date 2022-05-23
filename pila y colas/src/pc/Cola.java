package pc;

import lse.ListaSE;
import lse.Nodo;

public class Cola extends ListaSE {
    @Override
    public void insertar(Object dato) {
            if(estaVacio()){
                Nodo nuevo = new Nodo(dato,null);
                primeiro=nuevo;
            }else {
                Nodo ultimo = primeiro;
                while (ultimo.getSiguiente() != null){
                    ultimo = ultimo.getSiguiente();
                }
                Nodo nuevo = new Nodo(dato,null);
                ultimo.setSiguiente(nuevo);
            }
    }
}
