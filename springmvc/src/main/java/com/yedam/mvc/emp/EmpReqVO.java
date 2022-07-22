package com.yedam.mvc.emp;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpReqVO {
	private String employee_id;
	private List<String> depts;
	private String job_id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date sdt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date edt;
}
