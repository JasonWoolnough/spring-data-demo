package bootcamp.woolnough.jason.springdatademo.classroom;

import java.util.List;
import java.util.stream.Collectors;

public class Classroom {
    private int id;
    private int grade;
    private String teacherName;
    List<Student> students;

    public Classroom(ClassroomEntity classroomEntity) {
        this.id = classroomEntity.getId();
        this.grade = classroomEntity.getGrade();
        this.teacherName = classroomEntity.getTeacherName();
        this.students = classroomEntity.getStudents().stream().map(Student::new).collect(Collectors.toList());
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public List<Student> getStudents() {
        return students;
    }
}
