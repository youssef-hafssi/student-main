package ma.xproce.student.web;

import lombok.AllArgsConstructor;
import ma.xproce.student.dto.StudentDto;
import ma.xproce.student.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQLController {

    private StudentService studentService;

    @MutationMapping
    public StudentDto saveStudent(@Argument StudentDto avion){
        return studentService.saveStudent(avion);
    }

    @MutationMapping
    public Boolean deleteStudent(@Argument Long id){
        return studentService.deleteStudent(id);
    }


    @QueryMapping
    public List<StudentDto> getStudentByDateNaissance(@Argument String dateNaissance){
        return studentService.getStudentByDateNaissance(dateNaissance);
    }


}