package tratamento_de_excecao.exceptions;

public class UsingExceptions {
    public static void main(String[] args) {
        try{
            method1();
        } catch (Exception exception) {
            System.out.printf("%s\n\n", exception.getMessage());
            exception.printStackTrace();

            // cada elemento do array é uma chamada no rastreamento de pilha.
            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.print("\ncaminho de pilha de getStackTrace\n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s\n", element.getMethodName());
            }
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        method3();
    }

    public static void method3() throws Exception {
        throw new Exception("Exceção lançada no metódo 3");
    }
}
