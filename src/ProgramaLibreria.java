import java.util.Scanner;

public class ProgramaLibreria {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Metodos mt = new Metodos();
        System.out.println("Menú Librería");
        int opcion = 0;
        boolean salir = false;
        do{
            System.out.println("\n1. Cambiar código\n2. Cambiar título\n3. Cambiar autor\n4. Cambiar editorial\n5. Mostrar libros\n6. Salir");
            opcion = sc.nextInt();
            String opcion2 = sc.nextLine();
            switch(opcion)
            {
                case 1 :
                    mt.CambiarCodigo();
                    break;

                case 2 :
                    mt.CambiarTitulo();
                    break;

                case 3 :
                    mt.CambiarAutor();
                    break;

                case 4 :
                    mt.CambiarEditorial();
                    break;

                case 5 :
                    mt.MostrarLibros();
                    break;

                case 6 :
                    salir=true;
                    break;

                default :
                    System.out.println("Introduzca un número del 1-6");
            }
            System.out.println();

        }while(opcion!=6);
    }
}
