/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Nicola
 */
public class Lista {

    Nodo pFirst;
    Nodo pLast;
    int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return pFirst == null;
    }

    public void Vaciar() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public void insertarInicio(int val) {
        Nodo nuevo = new Nodo(val);
        if (this.isEmpty()) {
            this.pFirst = nuevo;
            this.pLast = nuevo;
        } else {
            nuevo.pnext = this.pFirst;
            this.pFirst = nuevo;
        }
        size++;
    }

    public void insertarFinal(int val) {
        Nodo nuevo = new Nodo(val);
        if (this.isEmpty()) {
            this.pFirst = nuevo;
            this.pLast = nuevo;
        } else {
            this.pLast.pnext = nuevo;
            this.pLast = this.pLast.pnext;
        }
        size++;
    }

    public int EliminarPrimero() {
        if (this.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else if (this.pFirst == this.pLast) {
            Nodo aux = this.pFirst;
            this.Vaciar();
            return aux.data;
        } else {
            Nodo aux = this.pFirst;
            this.pFirst = this.pFirst.pnext;
            aux.pnext = null;
            size--;
            return aux.data;
        }
        return -1;
    }

    public int EliminarUltimo() {
        if (this.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else if (this.pFirst == this.pLast) {
            Nodo aux = this.pFirst;
            this.Vaciar();
            return aux.data;
        } else {
            Nodo aux = this.pFirst;
            while (aux.pnext != this.pLast) {
                aux = aux.pnext;
            }
            int data = this.pLast.data;
            aux.pnext = null;
            this.pLast = aux;
            return data;
        }
        return -1;
    }
    
    public void Recorrer(){
        if (this.isEmpty()) {
            System.out.println("La lista esta vacio");
        } else{
        Nodo aux = this.pFirst;
            while (aux!= null) {
                System.out.println(aux.data);
                aux = aux.pnext;
            }
        }
    
    }

}
