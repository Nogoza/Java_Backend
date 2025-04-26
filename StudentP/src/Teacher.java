public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("Teacher information");
        System.out.println("Name: " + this.name);
        System.out.println("MPNO: " + this.mpno);
        System.out.println("Branch: " + this.branch);
    }
}
