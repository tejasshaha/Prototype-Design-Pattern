public class Main {

    public static void main(String[] args) {
        Student student=new Student(1,"Tejas");
        System.out.println(student.rollNo +" - " + student.name);

        //Shallow copy
        // If we change in student object or cloneStudent object it will affect in both which is not a good practice.
//        Student cloneStudent = student;
//        student.rollNo=2;
//        cloneStudent.rollNo=3;
//        System.out.println(cloneStudent.rollNo + " - " + cloneStudent.name);
//        System.out.println(student.rollNo +" - " + student.name);

        //Solution - Deep copy
        Student cloneStudent = student.createStudent();
        cloneStudent.name="Sushil";
        System.out.println(cloneStudent.rollNo + " - " + cloneStudent.name);
    }
}
