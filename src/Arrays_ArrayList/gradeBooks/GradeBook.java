package Arrays_ArrayList.gradeBooks;

public class GradeBook {
    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void processGrades() {
        outputGrades();

        System.out.printf("\nMédia da sala é %.2f\n", getAverage());

        System.out.printf("Menor nota é %d\nMaior nota é %d\n\n", getMinimum(), getMaximum());

        outputBarChart();
    }

    public int getMinimum() {
        int lowGrade = grades[0];

        for (int grade : grades) {
            if (grade < lowGrade)
                lowGrade = grade;
        }

        return lowGrade;
    }

    public int getMaximum() {
        int highGrade = grades[0];

        for (int grade : grades) {
            if (grade > highGrade)
                highGrade = grade;
        }

        return highGrade;
    }

    public double getAverage() {
        int totalGrade = 0;
        for (int grade : grades)
            totalGrade += grade;

        return (double) totalGrade / grades.length;
    }

    public void outputBarChart() {
        System.out.println("Distribuição de notas:");

        int[] frequency = new int[11];

        for (int grade : grades)
            ++frequency[grade / 10];

        for (int count = 0; count < frequency.length; count++) {
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void outputGrades() {
        System.out.print("As notas são as seguintes: \n\n");

        for(int student = 0; student < grades.length; student++)
            System.out.printf("Student %2d: %3d\n", student + 1, grades[student]);
    }
}
