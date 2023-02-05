package JavaBasic;

import java.util.HashMap;
import java.util.Scanner;

public class Library {
    public static void main(String[] args){
        /* Przy pomocy programowania obiektowego, stwórz aplikację
        będącą wirtualną biblioteką. Zaimplementuj klasę reprezentującą
        książkę, która zawiera takie informacje, jak tytuł, autor, data
        wydania, gatunek, ilość stron oraz status wypożyczenia. Biblioteka
        powinna zawierać zbiór książek i powinna umożliwiać ich wypożyczanie i
        oddawanie użytkownikom. Użytkownik może na raz wypożyczyć 3 książki.
         */
        
        // Create new book objects
        Book bookA =
                new Book("Small Gods", "Terry Pratchett", 1992,
                        "Novel", 402, true);
        Book bookB =
                new Book("How to teach quantum physics to your dog", "Chad Orzel",
                        2009, "Humor", 286, true);

        // Add book objects to array list
        HashMap<Integer, Book> allBooks = new HashMap<>();
        allBooks.put(1, bookA);
        allBooks.put(2 ,bookB);

        System.out.println("List of available books:");

            System.out.println(allBooks);


        System.out.println("What book do you want to lend?");

        Scanner scanner = new Scanner(System.in);
        String chosenBook = scanner.nextLine();

        
    }
}


