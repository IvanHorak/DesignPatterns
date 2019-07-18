package architectural.mvc;

public class RunMVCExample {
    public static void main(String[] args) {
        //initializing controller, passing student fetched from "database"
        StudentController controller = new StudentController(retriveStudentFromDatabase(), new StudentView());

        //acting on the View part of MVC
        controller.updateView();

        //acting on the Model part of MVC
        controller.setStudentName("John");

        //refreshing View part of MVC
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Ivan Horak");
        student.setRollNo("1337");
        return student;
    }
}
