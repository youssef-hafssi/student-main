package ma.xproce.student.mapper;

import ma.xproce.student.dao.entities.Student;
import ma.xproce.student.dto.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Student fromStudentDtoToStudent(StudentDto studentDto){
        return mapper.map(studentDto, Student.class);
    }

    public StudentDto fromStudentToStudentDto(Student student){
        return mapper.map(student, StudentDto.class);
    }

}
