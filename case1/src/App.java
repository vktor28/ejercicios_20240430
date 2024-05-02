import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Tienes una colección de bicicletas y vas registrando los últimos modelos que compraste en WallaPop.
- Debes crear una clase Bicicleta con características como: Marca, Modelo, Velocidad Máxima, Si
tiene marchas o no … (estas características puedes cambiarlas según tu gusto)
- Puedes añadir métodos: tocar el claxon, pedalear, parar, girar, cambiar marchas, …
- Recordar que debe haber también un método constructor y un toString()
- Primero probar instanciar una o dos bicicletas sueltas
- Luego, probar a crear un arraylist  de bicicletas
- Y recorrer ese arraylist  para mostrarlo con bucle for y/o for-each
- También se puede mostrar una sola propiedad (o varias) de las bicicletas. Ej: mostrar solo marca y
velocidad máxima de todas las bicicletas.
- Tema booleanos, probad a ponerlo como texto. Ej: “sí incluye cambio de marchas” (modificar el toString() )
- Probar métodos set desde el main()

+EXTRA: crear o cambiar o leer desde el scanner de usuario (con o sin bucle)


 * 
 */
public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Bicicleta> bic = new ArrayList<>();
 
        Bicicleta m1 = new Bicicleta("Parapera","Anemos","carretera", 80, true, 1200);
        Bicicleta m2 = new Bicicleta("BMC","TEAMMACHINE SLR","montaña", 60, true, 2846);
        Bicicleta m3 = new Bicicleta("CUBE","HYDE Race","ciudad", 45, false, 600);
        System.out.println(m1);
        System.out.println(m2);

        bic.add(m1);
        bic.add(m2);
        bic.add(m3);
        System.out.println("Bicicle suelta 1:");
        System.out.println(m1);

        //mostramos todos los modelos (toSting)
        System.out.println("\nBicicle toString:");
        System.out.println(bic);

        for (int i=0; i<bic.size(); i++){
            //con otra versión toString2
            System.out.println("\nEstas son las bicicletas que tenemos de la marca "+bic.get(i).getMarca()+":\n"+bic.get(i).toString2()+"\n");
        }

        
        for(Bicicleta bk: bic){
            System.out.println("La bicicleta "+ bk.getMarca() + " es de " + bk.getTipo() + " y su velocidad máxima es de " + bk.getVelocidadMax() + "Km/h.");
        }
        m1.tocaClaxon(true);
        
        /*System.out.println("\n¿Quieres aplicar una oferta a una marca? Elige una opción");
        System.out.println("1. Día sin IVA");
        System.out.println("2. Otro descuetno");
        Scanner teclado = new Scanner(System.in);
        int tipoDto = teclado.nextInt();
        
        
        if(tipoDto==1){
            double dto=1/21;}
        else if (tipoDto==1){
            System.out.println("introduce el descuento que quieres realizar:");
            double dto = teclado.nextInt();
        }else {System.out.println("Error");}

        System.out.println("¿A que marca lo quieres aplicar?");
        System.out.println();
         */
        m2.setPrecio(2342);
        System.out.println("\nDía sin IVA de " + bic.get(1).getMarca() + ". Llévate el modelo " + bic.get(1).getModelo() + " por solo : " + bic.get(1).getPrecio() + "€!!!!" );
       
    }


}
