import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class program {
    /**
     * @param args
     * @param ReproductorSPOTY nuevo vector
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ReproductorSPOTY rep = new ReproductorSPOTY();
        rep.AgregarCancion("Por El Boulevard De Los Sueños Rotos");
        rep.AgregarCancion("Mariposa traicionera");
        rep.AgregarCancion("A las nueve");
        String tecla ="";

        do{
        System.out.println(" =======================================");
        System.out.println("|       1. Encender reproductor                  |");
        System.out.println("|       2. Apagar reproductor                |");
        System.out.println("|       3. Agregar lista de canción                |");
        System.out.println("|       4. Reproducir primera canción            |");
        System.out.println("|       5. Reproducir última canción            |");
        System.out.println("|       6. Número de canciones que contiene la lista de reproducción            |");
        System.out.println("|       7. Reproducir canción actual |");
        System.out.println("|  *Ingresa un número para elegir una opción del menú*  |");
        System.out.println(" =======================================");
        System.out.println("");
        System.out.print("Opción N°: ");
        }while (tecla.equals("s") || tecla.equals("S"));
        Scanner SC = new Scanner(System.in);
        
        int opción1;
        opción1 = SC.nextInt();
            
        switch (opción1) {

            case 1:
                rep.Prender();

                break;

            case 2:
                rep.Apagar();

                break;

            case 3:
                System.out.println("Agregar una nueva lista de canción");
                break;

            case 4:
                rep.ReproducirPrimerCancion();
                break;

            case 5:
                rep.ReproducirUltimaCancion();
                break;

            case 6:
                rep.Contarcanciones();
                break;

            case 7:
                rep.ReproducirCancion("Mariposa traicionera");
                break;
            default:
                System.out.println("Seleccione una opción válida");
            }
            
            tecla = SC.nextLine();
            System.out.println("¿Volver al menú anterior?");
            System.out.println("Oprima S para confirmar y N para salir");

        // System.out.println(rep.CancionActual()); //"Mariposa traicionera"
        // rep.ReproducirAnterior();
        // System.out.println(rep.CancionActual()); //"Por El Boulevard De Los Sueños
        // Rotos"
        // rep.ReproducirSiguiente();

        // System.in.read();

    }
}
