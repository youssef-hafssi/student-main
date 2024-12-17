package ma.xproce.student.service;

import ma.xproce.student.dto.StudentDto;

import java.util.List;

public interface StudentService {
    public StudentDto saveStudent(StudentDto studentDto);


    boolean deleteStudent(Long id);

    List<StudentDto> getStudentByDateNaissance(String dateNaissance);

//    public List<AvionDto> saveAvions(List<AvionDto> avionDtos);

}
