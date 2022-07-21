package com.dodo.springDept;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dodo.springDept.dept.DepartmentMapper;
import com.dodo.springDept.dept.DepartmentVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class BoardMapperTest {
	@Autowired DepartmentMapper mapper;
	   
	   @Test
	   public void test() {
		   List<DepartmentVO> list = mapper.getDeptList();
	   }
}
