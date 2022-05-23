package lse;

public class ListaSE {
    protected Nodo primeiro;

    public ListaSE(){
        primeiro = null;
    }

    public boolean estaVacio(){
        return primeiro == null;
    }

    public void insertar(Object dato){
        if(estaVacio()){
            Nodo nuevo = new Nodo(dato,null);
            primeiro=nuevo;
        }else {
            Nodo nuevo = new Nodo(dato,primeiro);
            primeiro = nuevo;
        }
    }
    public void eliminar(){
        if (!estaVacio()){
            primeiro = primeiro.getSiguiente();
        }
    }
    public void mostrar(){
        Nodo tmp = primeiro;
        while (tmp !=null){
            System.out.print(tmp.getDato()+"  ");
            tmp=tmp.getSiguiente();
        }
        System.out.println();
    }
}
