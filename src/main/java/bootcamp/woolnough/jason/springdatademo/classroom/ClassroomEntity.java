package bootcamp.woolnough.jason.springdatademo.classroom;

import bootcamp.woolnough.jason.springdatademo.student.StudentEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "CLASSROOM", schema = "PUBLIC", catalog = "TESTDB")
public class ClassroomEntity {
    private Integer id;
    private Integer grade;
    private String teacherName;
    private Collection<StudentEntity> students;

    @Id
    @Column(name = "ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "GRADE")
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "TEACHER_NAME")
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @OneToMany(mappedBy = "classroom")
    public Collection<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(Collection<StudentEntity> students) {
        this.students = students;
    }
}
