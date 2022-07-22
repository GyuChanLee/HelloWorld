package com.yedam.mvc.emp;

import java.util.List;

public interface EmpMapper {
	public EmpVO getEmp(EmpVO vo);
	public List<EmpVO> getList();
	public List<EmpVO> getSearchList(EmpReqVO vo);
	public int insertEmp(EmpVO vo);
	public int update(EmpVO vo);
}
