import university.Student;
import university.Valedictorian;

public class Main {
    public static void main(String[] args) {
        FindMax.fileInputOutput();

        Student student=new Student();
        student.printMessage();

        Valedictorian valedictorian = new Valedictorian();
        valedictorian.printMessage();
    }
}
