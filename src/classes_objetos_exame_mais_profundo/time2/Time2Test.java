package classes_objetos_exame_mais_profundo.time2;

public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2(t4);

        System.out.println("Constructed with: ");
        displayTime("t1: todos os argumentos default", t1);
        displayTime("t2: hora especificada, minuto e segundos default", t2);
        displayTime("t3: hora e minuto especificada, segundos default", t3);
        displayTime("t4: hora, minuto e segundos especificados", t4);
        displayTime("t5: objeto Time2 especificado", t5);

        try {
            Time2 t6 = new Time2(25, 222, 199);
        } catch (IllegalArgumentException e) {
            System.out.printf("\n Exception enquanto inicializa o t6: %s\n", e.getMessage());
        }
    }

    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s\n %s\n %s\n", header, t.toUniversalString(), t);
    }
}
