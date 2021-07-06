package Arrays_ArrayList.gradeBooks;

public class GradeBookTest {
    public static void main(String[] args) {
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87, 23, 43, 11, 34, 66};

        GradeBook myGradeBook = new GradeBook("Introdução a programação Java", gradesArray);

        System.out.printf("Bem vindo à caderneta de notas de \n%s\n\n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
