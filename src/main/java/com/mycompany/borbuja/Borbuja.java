/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.borbuja;

/**
 *
 * @author Bryan Hafizi 4-C
 * link de conversasion https://share.gemini.google/BN4jf8lkV4XD
 */
public class Borbuja {

    public static void main(String[] args) {
        int[] arreglo={60,79,22,93,21};
        imprimirOrdenamiento(arreglo);
        System.out.println("Arreglo 1 con ordenamiento burbuja:" );
        ordenamientoBurbuja(arreglo);
        imprimirOrdenamiento(arreglo);
        System.out.println("========================================");
        arreglo=new int[]{6,7,8,10,9};// un arreglo parcialmente desordenado para mostrar la eficiencia del metodo mejorado
        imprimirOrdenamiento(arreglo);
        System.out.println("Arreglo 2 con ordenamiento burbuja mejorado:" );
        ordenamientoBurbujaMejorado(arreglo);
        imprimirOrdenamiento(arreglo);
    }
    public static void ordenamientoBurbuja(int[] arreglo){     
        for (int i = 0; i < arreglo.length - 1; i++){
            for(int j=0; j<arreglo.length-1; j++){
                 
                if (arreglo[j] > arreglo[j + 1]){
                    int temp = arreglo[j];// Guardamos el valor actual de arreglo[j] en la variable temporal
                    arreglo[j] = arreglo[j + 1];//Pasamos el valor del vecino arreglo[j + 1] a arreglo[j]
                    arreglo[j + 1] = temp;//Pasamos el valor guardado en temp a arreglo[j + 1]
                }
                
            }
        }
    }
    public static void ordenamientoBurbujaMejorado(int[] arreglo){
        for (int i = 0; i < arreglo.length - 1; i++){
            boolean huboIntercambio= false;//bandera q indica si hubo intercambio
            for(int j=0; j<arreglo.length-1; j++){
                 
                if (arreglo[j] > arreglo[j + 1]){
                    huboIntercambio=true;
                    int temp = arreglo[j];// Guardamos el valor actual de arreglo[j] en la variable temporal
                    arreglo[j] = arreglo[j + 1];//Pasamos el valor del vecino arreglo[j + 1] a arreglo[j]
                    arreglo[j + 1] = temp;//Pasamos el valor guardado en temp a arreglo[j + 1]
                }
                
            }
            if (!huboIntercambio) {// si no hubo intercambio rompe el ciclo
                    break; 
            }
        }
    }
    public static void imprimirOrdenamiento(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]+" ");    
        }
        System.out.println();
    }
}
