package bootcamp.woolnough.jason.springdatademo.classroom;

import bootcamp.woolnough.jason.springdatademo.student.StudentEntity;

public class Student {
    private int id;
    private String firstName;
    private int age;

    public Student(StudentEntity studentEntity) {
        this.id = studentEntity.getId();
        this.firstName = studentEntity.getFirstName();
        this.age = studentEntity.getAge();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
