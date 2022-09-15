package ss5_access_modifier_static.build_class_student;

public class Student {
    private String name;
    private String classes;

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Student() {
        this.name = "John";
        this.classes = "C02";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
