import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ReproductorSPOTY {
    private ArrayList<String> canciones;
    private String NombreCancion;
    private String ArtistaCancion;
    private int Duracion;
    private int DuracionTotal;
    private int estadoreproductor = 1;

    public String getNombreCancion() {
        return NombreCancion;
    }

    public void setNombreCancion() {
        this.NombreCancion = NombreCancion;
    }

    public String getArtistaCancion() {
        return ArtistaCancion;
    }

    void AgregarCancion(String cancion) {
        if (estadoreproductor == 1) {
            canciones.add(cancion);
        }
    }

    public ReproductorSPOTY() {
        canciones = new ArrayList();
        Iterator<String> it = canciones.iterator();
    }

    void Prender() {
        System.out.println("Se ha encendido el reproductor");
        estadoreproductor = 1;
    }

    void Contarcanciones() {
        int tamaño = canciones.size();
        System.out.println("Tienes agregado " + tamaño + " canciones a tu lista de reproducción");
    }

    void Apagar() {
        System.out.println("Se ha apagado el reproductor");
        estadoreproductor = 0;

    }

    void ReproducirUltimaCancion() {
        if (estadoreproductor == 1) {

            int ultimoelemento = Integer.parseInt(canciones.get(canciones.size() - 1));
            System.out.println("Reproducir la última canción:" + ultimoelemento);
        }
    }

    void ReproducirPrimerCancion() {
        if (estadoreproductor == 1) {
            int primerelemento = Integer.parseInt(canciones.get(0));
            System.out.println("Reproducir la primera canción:" + primerelemento);

        }

    }

    void ReproducirSiguiente() {
        // iterator.nextIndex();

    }

    void ReproducirAnterior() {
    }

    void ReproducirCancion(String mariposa_traicionera) {
    }

    // boolean CancionActual() {
    // return false;
    // System.out.println(NombreCancion);
    // throw new UnsupportedOperationException("Not supported yet."); //To change
    // body of generated methods, choose Tools | Templates.
    // }
}
