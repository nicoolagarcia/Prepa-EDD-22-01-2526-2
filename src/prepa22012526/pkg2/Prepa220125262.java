/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepa22012526.pkg2;

import EDD.Lista;
import EDD.Solucion;

/**
 *
 * @author Nicola
 */
public class Prepa220125262 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista milista = new Lista();
        milista.insertarFinal(0);
        milista.insertarFinal(1);
        milista.insertarFinal(2);
        milista.insertarFinal(3);
        milista.EliminarPrimero();
        milista.Recorrer();
        
        Solucion.Rotar(milista, 2);
        milista.Recorrer();
        
    }
    
}
