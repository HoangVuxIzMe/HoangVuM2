package ss5_access_modifier_static.build_class_student;

public class DisplayStudent {
    public static void main(String[] args) {
        Student student1 = new Student("SpiderMan", "Marvel");
        Student student2 = new Student();
        student2.setName("Tommy");
        System.out.println(student1);
        System.out.println(student2);
    }
}
