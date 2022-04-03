import java.util.Objects;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    Libros libro1 = new Libros("AB1234", "El juego del ángel", "Carlos Ruiz Zafón", "Editorial Acantilado");
    Libros libro2 = new Libros("AB2345", "Fariña", "Nacho Carretero", "ACEN Editorial");
    Libros libro3 = new Libros("AB3456", "Patria", "Fernando Aramburu", "Aduana Vieja");

    public void CambiarCodigo(){
        System.out.println("Indique el título del libro: ");
        String respuesta = sc.nextLine();
        if(Objects.equals(respuesta, libro1.getTitulo())){
            System.out.println("Nuevo código: ");
            String codigo = sc.nextLine();
            libro1.setCodigo(codigo);
        }
        if(Objects.equals(respuesta, libro2.getTitulo())){
            System.out.println("Nuevo código: ");
            String codigo = sc.nextLine();
            libro2.setCodigo(codigo);
        }
        if(Objects.equals(respuesta, libro3.getTitulo())){
            System.out.println("Nuevo código: ");
            String codigo = sc.nextLine();
            libro3.setCodigo(codigo);
        } else {
            System.out.println("Introduzca un código correcto");
        }
    }
    public void CambiarTitulo(){
        System.out.println("Indique el código del libro: ");
        String respuesta = sc.nextLine();
        if(Objects.equals(respuesta, libro1.getCodigo())){
            System.out.println("Nuevo título: ");
            String titulo = sc.nextLine();
            libro1.setTitulo(titulo);
        }
        if(Objects.equals(respuesta, libro2.getCodigo())){
            System.out.println("Nuevo título: ");
            String titulo = sc.nextLine();
            libro2.setTitulo(titulo);
        }
        if(Objects.equals(respuesta, libro3.getCodigo())){
            System.out.println("Nuevo título: ");
            String titulo = sc.nextLine();
            libro3.setTitulo(titulo);
        } else {
            System.out.println("Introduzca un título correcto");
        }
    }
    public void CambiarAutor(){
        System.out.println("Indique el título del libro: ");
        String respuesta = sc.nextLine();
        if(Objects.equals(respuesta, libro1.getTitulo())){
            System.out.println("Nuevo autor: ");
            String autor = sc.nextLine();
            libro1.setAutor(autor);
        }
        if(Objects.equals(respuesta, libro2.getTitulo())){
            System.out.println("Nuevo autor: ");
            String autor = sc.nextLine();
            libro2.setAutor(autor);
        }
        if(Objects.equals(respuesta, libro3.getTitulo())){
            System.out.println("Nuevo autor: ");
            String autor = sc.nextLine();
            libro3.setAutor(autor);
        } else {
            System.out.println("Introduzca un autor correcto");
        }
    }
    public void CambiarEditorial(){
        System.out.println("Indique el título del libro: ");
        String respuesta = sc.nextLine();
        if(Objects.equals(respuesta, libro1.getTitulo())){
            System.out.println("Nueva editorial: ");
            String editorial = sc.nextLine();
            libro1.setEditorial(editorial);
        }
        if(Objects.equals(respuesta, libro2.getTitulo())){
            System.out.println("Nueva editorial: ");
            String editorial = sc.nextLine();
            libro2.setEditorial(editorial);
        }
        if(Objects.equals(respuesta, libro3.getTitulo())){
            System.out.println("Nueva editorial: ");
            String editorial = sc.nextLine();
            libro3.setEditorial(editorial);
        } else {
            System.out.println("Introduzca una editorial correcta");
        }
    }
    public void MostrarLibros(){
        System.out.println("\nLibro:\nCódigo: " + libro1.getCodigo() + "\nTítulo: " + libro1.getTitulo()
        + "\nAutor: " + libro1.getAutor() + "\nEditorial: " + libro1.getEditorial());
        System.out.println("\n\nLibro:\nCódigo: " + libro2.getCodigo() + "\nTítulo: " + libro2.getTitulo()
                + "\nAutor: " + libro2.getAutor() + "\nEditorial: " + libro2.getEditorial());
        System.out.println("\n\nLibro:\nCódigo: " + libro3.getCodigo() + "\nTítulo: " + libro3.getTitulo()
                + "\nAutor: " + libro3.getAutor() + "\nEditorial: " + libro3.getEditorial());
    }
}
