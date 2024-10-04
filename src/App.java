import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Moba mO = new Moba();
        Scanner leer = new Scanner(System.in);

        int arrayLength = leerEnteroValido(leer, "Ingrese un numero entero positivo", false);

        int[] arreglo = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++){
            arreglo[i] = leerEnteroValido(leer, "Ingrese un numero en la posicion" + (i+1), true);
        }


        mO.printArray(arreglo);
        System.out.println(" ");
        mO.sortBubbleAdvance(arreglo);
        mO.printArray(arreglo);

        
    }
    public static int leerEnteroValido(Scanner leer, String mensaje, boolean permitirNegativos){
        int arrayLength = 0;

        do{
            System.out.println(mensaje);
            System.out.println("Ingrese el tamaño que sea entero positivo");
            while (!leer.hasNextInt()) {
                System.out.println("Te pedi un entero valido :/");
                System.out.println(mensaje);
                leer.next();
            }
            arrayLength = leer.nextInt();
            if (!permitirNegativos && arrayLength <= 0){
                System.out.println("El tamaño debe ser entero positivo mayor a 0");
            }
        } while(! permitirNegativos && arrayLength <= 0);
        return arrayLength;
    }
}
