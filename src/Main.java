public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        Student student = new Student();

        instructor.setId(1);
        User.name ="Levent";
        User.sName="Atahanlı";
        User.age=32;
        instructor.seteMail("softwareteacher.dev@erciyes.edu");
        Instructor.salary =7400;
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.List();
        instructorManager.reqSalary(instructor);
        instructor.printEmail();


        student.setId(2);
        User.name ="Ela";
        User.sName="Altındağ";
        User.age=27;
        student.setStdNo(1030510165);
        Student.Course ="Java Bootcamp";
        stdManager stdManager = new stdManager();
        stdManager.editStdNo(student);
        stdManager.chooseCourse(student);
    }
}
