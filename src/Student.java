public class Student implements StudentPrototype{

    int rollNo;
    String name;

    public Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    @Override
    public Student createStudent() {
        return new Student(rollNo,name);
    }
}
