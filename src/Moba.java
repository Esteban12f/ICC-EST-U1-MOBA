import java.util.Scanner;

public class Moba {
    
    public int [] sortBubbleAdvance(int[] arreglo){

        int n = arreglo.length;
        boolean intercambio = false;

        for (int i = 0; i < n; i++){
            System.out.println("Pasada "+ i);
            intercambio = false;
            for (int j = 0; j < n-1-i; j++){
                System.out.println("j = " + j + " [j] = " + arreglo[j] + " j + 1 = "
                + (j+1) + " [j+1] = " + arreglo[j+1]);
                if (arreglo[j] > arreglo[j + 1]){
                    System.out.println("Si hay cambio");
                //Intrecambio 
                int aux = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = aux;
                intercambio = true;
                }
                }
                //Si no hubo intercambio
                if (!intercambio){
                break;
            }
        }
        return arreglo;
    }

    public void printArray (int[] arreglo){
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i != arreglo.length-1){
                System.out.print(" , ");
            }
        }
        System.out.print("]");
    }


}
