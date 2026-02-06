/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Nicola
 */
public class Solucion {

    static public Lista Rotar(Lista milista, int k) {
        if (milista.isEmpty() || k % milista.size == 0) {
            return milista;
        } else {
            for (int i = 0; i < k; i++) {
                int num = milista.EliminarUltimo();
                milista.insertarInicio(num);
            }
            return milista;
        }

    }
}
