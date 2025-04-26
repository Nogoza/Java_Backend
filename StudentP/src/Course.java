public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printteacherinfo();
            System.out.println("--------------");
        }else{
            System.out.println("Teacher not added");
            System.out.println("--------------");
        }
    }
    void printteacherinfo(){
        this.teacher.print();
    }
}
