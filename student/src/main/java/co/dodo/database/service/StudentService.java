package co.dodo.database.service;

import java.util.List;

import co.dodo.database.dto.StudentVO;

public interface StudentService
{
	// CRUD 기능
	List<StudentVO> selectListStudent(); // Read 전체 학생 목록 읽기
	StudentVO selectStudent(StudentVO student); // Read 한명 읽기
	int insertStudent(StudentVO student); // Create 한명 추가
	int updateStudent(StudentVO student); // Update 한명 갱신
	int deleteStudent(StudentVO student); // Delete 한명 삭제
	
}
