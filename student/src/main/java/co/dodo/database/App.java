package co.dodo.database;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import co.dodo.database.dto.StudentVO;
import co.dodo.database.service.StudentService;
import co.dodo.database.serviceImpl.StudentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	StudentService dao = new StudentServiceImpl();
    	
    	// 전체 목록 검색
    	List<StudentVO> list = new ArrayList<StudentVO>();
    	list = dao.selectListStudent();
    	
    	for(StudentVO vo : list)
    	{
    		vo.toString();
    	}
//    	
//    	System.out.println("======================================================================================================");
//      // 한명 검색
//    	StudentVO stud = new StudentVO(); // 검색할 객체 
//    	stud.setStudent_id("pack@naver.com"); // 찾을 id 입력.
//    	stud = dao.selectStudent(stud);
//    	stud.toString();
//    	
//    	System.out.println("======================================================================================================");    	
//    	StudentVO vo = new StudentVO(); // insert문
//    	vo.setStudent_id("dodobird2@naver.com");
//    	vo.setMajor("곤충학과");
//    	vo.setName("김규찬");
//    	vo.setBirthday(Date.valueOf("2000-01-23"));
//    	vo.setAddress("경산시 진량읍 저자길 113");
//    	vo.setTel("017-5050-4545");
//    	int n = dao.insertStudent(vo);
//    	if(n!=0) // 성공하면 어플리케이션에서 된 것은 자동 커밋.
//    	{
//    		System.out.println("정상 입력되었습니다.");
//    	}
//    	else // 0이 넘어오면 실패.
//    	{
//    		System.out.println("몬가 실패함.");
//    	}
    	
    	// 프로시져 타입 : void 리턴값. > 수행만 하고 끝내도 될 때.
    	// function 타입 : 리턴값이 존재. > 데이터를 받아와야 할 필요가 있을 때.
    	
    	
    }
}
