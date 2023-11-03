package tn.esps.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import tn.esps.dto.StudentDto;

@Service
public class StudentService {

	private List<StudentDto> students = new ArrayList<>();
	
	public StudentService() {
		students.add(new StudentDto(1, "Yaich", 'M'));
		students.add(new StudentDto(2, "Firas", 'M'));
	}
	
	public void save(StudentDto studentsDto) {
		students.add(studentsDto);
	}
	
	public List<StudentDto> findAll(){
		return students;
	}
	
	public void delete(Integer id) {
		// students.remove(new StudentDto(id, null, ' '));
		for (StudentDto std : students) {
			if (std.getId().equals(id)) {
				students.remove(std);
				break;
			}
		}
	}
	
	
	
}
