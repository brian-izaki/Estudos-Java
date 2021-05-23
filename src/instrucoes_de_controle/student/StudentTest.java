package instrucoes_de_controle.student;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("Jane Green", 93.5);
        Student student2 = new Student("John Blue", 72.75);
        Student student3 = new Student("Evandro", 52.75);

        System.out.printf("%s letter grade é: %s\n",
                student1.getName(), student1.getLetterGrade());

        System.out.printf("%s letter grade é: %s\n",
                student2.getName(), student2.getLetterGrade());

        System.out.printf("%s letter grade é: %s\n",
                student3.getName(), student3.getLetterGrade());

    }

}
