package classes_objetos_exame_mais_profundo.tipoEnum;

// é tipo ENUM
public enum Book {

    // constantes do tipo enum
    JHTP("Java How To Program", "2015"),
    CHTP("C How To Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# how to Program", "2014");

    // variáveis de instância
    private final String title;
    private final String copyrightYear;

    // construtor
    Book(String title, String copyrightYear){
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    // métodos
    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
