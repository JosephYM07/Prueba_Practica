public class Main {
    public static void main(String[] args) {
        System.out.println("\t\tLiteratura");
        //Se crea un objeto de la clase Literatura para cada libro
        Literatura libro1 = new Literatura("J.K. Rowling", "Salamandra", 1997, 256, "Harry Potter", "Harry Potter y la piedra filosofal");
        Literatura libro2 = new Literatura("Netherfield, Meryton", "Lambon", 1813, 448, "Darcy junto a Elizabeth", "Orgullo y prejuicio");
        Literatura libro3 = new Literatura("Virginia Woolf", "BritahsYK", 1876, 238, " Septimus Warren Smith, Clarissa Dalloway, Richard Dalloway, Hugh Whitbread, Rezia Warren Smith", "La señora Dalloway");
        Literatura libro4 = new Literatura("Gustave Flaubert", "NYEdit1", 2007, 231, " Emma Bovary, Charles Bovary, Señor Homais, MÁS", "Madame Bovary Novela de Gustave Flaubert");
        Literatura libro5 = new Literatura("Miguel de Cervantes", "Juan de la Cuesta a costa de Francisco de Robles", 1605, 462, " Sancho Panza, Dulcinea, Don Quijote de La Mancha, MÁS", "Don Quijote de la Mancha");
        // Se llama la funcion  mostrarDetallesLibro para mostrar los atributos de la clase Libros
        mostrarDetallesLibro(libro1);
        mostrarDetallesLibro(libro2);
        mostrarDetallesLibro(libro3);
        mostrarDetallesLibro(libro4);
        mostrarDetallesLibro(libro5);
    }

    //Se crea una funcion para llamar a los atributos de la clase Libros
    public static void mostrarDetallesLibro(Literatura libro) {
        System.out.println("Detalles del libro");
        System.out.println("Nombre del libro" + libro.getNombre_libro());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Editorial: " + libro.getEditorial());
        System.out.println("Año: " + libro.getAnio());
        System.out.println("Paginas: " + libro.getPaginas());
        System.out.println("Protagonista: " + libro.getProtagonista());
        System.out.println("\n\n");
    }
}