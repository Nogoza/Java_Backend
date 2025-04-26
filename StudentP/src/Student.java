public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;
    double note1 = 0;
    double note2 = 0;
    double note3 = 0;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

        this.average = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 > 0 && note1 <= 100) {
            this.note1 = note1;
        }
        if (note2 > 0 && note2 <= 100) {
            this.note2 = note2;
        }
        if (note3 > 0 && note3 <= 100) {
            this.note3 = note3;
        }
    }
    void printNote(){
        System.out.println(this.name);
        System.out.println(this.c1.name + "note: \t" + this.note1);
        System.out.println(this.c2.name + "note: \t" + this.note2);
        System.out.println(this.c3.name + "note: \t" + this.note3);
        System.out.println("---------------");
        }

    double calcAver(){
        this.average = (this.note1 + this.note2 + this.note3) / 3.0;
        return this.average;
    }
    void isPass(){
        printNote();

        if(calcAver() <= 60){
            System.out.println("Studend Average: " + calcAver());
            System.out.println("Studend could not pass the class!");
            System.out.println("------------");
        } else {
            System.out.println("Students average :\t" + calcAver());
            System.out.println("Student has passed the class !");
            System.out.println("------------------------");
        }
    }
}


