package classes_objetos_exame_mais_profundo.tipoEnum;

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Todos os livros");

        for (Book book : Book.values())
            System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear());

        System.out.print("\nMostra um intervalo de constantes enum: \n");

        for (Book book : EnumSet.range(Book.CHTP, Book.CPPHTP))
            System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear());
    }
}
