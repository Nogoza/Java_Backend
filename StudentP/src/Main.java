public class Main {
    public static void main(String[] args) {
        Teacher th1 = new Teacher("Fatih", "5552221111", "ALGO");
        Teacher th2 = new Teacher("Esra", "5615614040", "HR");
        Teacher th3 = new Teacher("Oğuzhan", "5551113333", "OOP");

        Course algorithm = new Course("Algorithms", "101", "ALGO");
        Course humanResources = new Course("Human Resources", "101", "HR");
        Course oop = new Course("OOP", "101", "OOP");

        algorithm.addTeacher(th1);
        humanResources.addTeacher(th2);
        oop.addTeacher(th3);

        Student st1 = new Student("Talha", "2021", "3", algorithm, humanResources, oop);
        Student st2 = new Student("Fatih", "2022", "3", algorithm, humanResources, oop);
        Student st3 = new Student("Esra", "2023", "3", algorithm, humanResources, oop);

        st1.addBulkExamNote(55, 40, 65);
        st2.addBulkExamNote(90, 80, 95);
        st3.addBulkExamNote(88, 70, 100);

        st1.isPass();
        st2.isPass();
        st3.isPass();

    }
}
