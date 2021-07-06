package classes_objetos_exame_mais_profundo.time1;

public class TimeTest {
    public static void main(String[] args) {
        Time1 time = new Time1();

        displayTime("Depois que objeto time é criado: ", time);
        time.setTime(13, 27, 6);
        System.out.println();

        displayTime("Depois que setTime é chamado: ", time);
        try {
            time.setTime(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("\nExceção: %s\n\n", e.getMessage());
        }

        displayTime("Depois que setTime é chamado com valore inválidos: ", time);
    }

    private static void displayTime(String header, Time1 t) {
        System.out.printf("%s\nUniversal time: %s\nStandard time: %s\n", header, t.toUniversalString(), t.toString());
    }


}
