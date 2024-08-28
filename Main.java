import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String input = scanner.nextLine();

        String HolaMundoExacto = "\\bHola mundo\\b";
        String HolaMundoCaseInsensitive = "(?i)\\bHola mundo\\b";
        String Lenguajes = "\\b(Java|Python|Go|Pascal|Perl)\\b";
        String CorreoUnison = "^[a-zA-Z0-9._%+-]+@(unison\\.mx|uson\\.mx)$";
        String NombreArchivo = "^ISI\\d{4}-[12]\\.(txt|csv)$";

        boolean matchHolaMundoExacto = input.matches(HolaMundoExacto);
        boolean matchHolaMundoCaseInsensitive = input.matches(HolaMundoCaseInsensitive);
        boolean matchLenguajes = input.matches(Lenguajes);
        boolean matchCorreoUnison = input.matches(CorreoUnison);
        boolean matchNombreArchivo = input.matches(NombreArchivo);

        if (matchHolaMundoExacto) {
            System.out.println("La cadena coincide 'Hola mundo'.");
        } else if (matchHolaMundoCaseInsensitive) {
            System.out.println("La cadena coincide con la frase 'Hola mundo' en cualquier combinación.");
        } else if (matchLenguajes) {
            System.out.println("La cadena coincide con uno de los lenguajes de programación (Java, Python, Go, Pascal, Perl).");
        } else if (matchCorreoUnison) {
            System.out.println("La cadena es un correo válido.");
        } else if (matchNombreArchivo) {
            System.out.println("La cadena es un nombre de archivo válido.");
        } else {
            System.out.println("La cadena NO coincide con ninguna de las expresiones.");
        }

        scanner.close();
    }
}

