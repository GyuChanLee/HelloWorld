package com.yedam.mvc.emp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	
	
	@Autowired EmpMapper mapper;
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class); // logger에 해당 클래스 이름 넣기.
	
	// 단건 조회
	@RequestMapping("/emp")
	public String emp(EmpVO vo, Model model) {
		logger.info("파라미터 : "+vo.toString());
		// logger를 이용하여 콘솔에 찍기.
		model.addAttribute("emp",mapper.getEmp(vo));
		// model > 기존의 request 객체의 역할 : view에 데이터 전달
		return "emp/emp";
	}
	
	// 목록
	@RequestMapping("/empList")
	public String empList(Model model) {
		model.addAttribute("list",mapper.getList());
		return "emp/empList";
	}
	
	// 검색 목록
		@PostMapping("/empList")
		public String empSearchList(EmpReqVO vo, Model model) {
			model.addAttribute("slist",mapper.getSearchList(vo));
			return "emp/empList";
		}
	
	// 등록 페이지 이동
	@GetMapping("/empInsert")
	public String empInsert() {
		// EmpVO vo, Model model
		return "emp/empInsert";
	}
	
	// 등록 처리
	@PostMapping("/empInsert") // post 속성 축약형
	// @RequestMapping(value = "/empInsert", method = RequestMethod.POST)
	public String empInsertProc(EmpVO vo) {
		// 스프링에서 자동으로 EmpVO에 받아온 파라미터를 담아줌.
		logger.debug(vo.toString());
		System.out.println(vo.toString());
		System.out.println(vo.getEmployee_id()+"사번 등록");
		mapper.insertEmp(vo);
		return "emp/empInsert";
	}
	
	// 수정
	@RequestMapping("/empUpdate/{id}")
	public String empUpdateForm(Model model, EmpVO vo, @PathVariable String id) {
		vo.setEmployee_id(id);
		model.addAttribute("emp", mapper.getEmp(vo));
		return "emp/empUpdate";
	}
	
	@RequestMapping("/empUpdate")
	public String empUpdateProc(EmpVO vo) {
		mapper.update(vo);
		return "redirect:empList";
	}
	
	// 삭제
	
}
