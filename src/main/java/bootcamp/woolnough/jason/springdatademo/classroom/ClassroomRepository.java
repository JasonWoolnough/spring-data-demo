package bootcamp.woolnough.jason.springdatademo.classroom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<ClassroomEntity, Integer> {
    ClassroomEntity findByGrade(Integer grade);

    @Query("select s.classroom from StudentEntity s where s.firstName = ?1")
    ClassroomEntity findByStudentName(String studentName);
}
