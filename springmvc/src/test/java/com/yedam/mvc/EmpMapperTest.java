package com.yedam.mvc;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.mvc.emp.EmpMapper;
import com.yedam.mvc.emp.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class EmpMapperTest {

   @Autowired EmpMapper mapper;
   
   @Test
   public void test() {

      EmpVO param = new EmpVO();
      param.setEmployee_id("100");
      EmpVO result = mapper.getEmp(param);
      System.out.println(result);
   
   
   
   }
   
   @Test
   public void test2() {
	   List<EmpVO> list = mapper.getList();
   }
   
}