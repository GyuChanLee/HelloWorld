package com.yedam.mvc;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/param2")
	public ModelAndView parameter2() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("parameter");
		mv.addObject("param1", "test");
		return mv;
	}
	
	@RequestMapping("/param")
	public String parameter() {
		// uri값과 페이지명이 같다면 알아서 찾아감 > return void
		return "/parameter";
	}
	
	@RequestMapping("/req1")
	public void req1(HttpServletResponse response,
					 @RequestParam(required = false, defaultValue = "lee") String id) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("id : "+ id);
	}
	
	@RequestMapping("/req2")
	public void req2(HttpServletResponse response,
					 @RequestParam List<String> ids) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("ids : "+ ids);
	}
	
	@RequestMapping("/req3")
	public void req3(HttpServletResponse response,
					 @RequestParam Map<String, Object> map) {
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print("map : "+ map);			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/req4")
	public void req4(HttpServletResponse response,
					 ReqVO vo) {
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print("ReqVO : "+ vo);			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/req5")
	public void req5(HttpServletResponse response,
					 ListReqVO vo) {
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print("ListReqVO : "+ vo);			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// 첨부파일
	@RequestMapping("/req6")
	public void req6(HttpServletResponse response,
					 ReqVO vo, List<MultipartFile> pic) {
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			// 첨부파일 업로드
			for(MultipartFile temp : pic) {
				if(temp != null && temp.getSize()>0) {
					temp.transferTo(new File("D:/upload", temp.getOriginalFilename()));
					out.print(temp.getOriginalFilename()+"<br>");
					out.print(temp.getSize());
				}				
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/req7/{id}/{age}")
	public void req7(HttpServletResponse response,
					 @PathVariable String id,
					 @PathVariable int age) {
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			
			out.print(id+" : "+age);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// String[] request.getParameterValues()
	
	@GetMapping("/array")
	public void array(@RequestParam String id,
						@RequestParam List<String> ids,
						HttpServletResponse response) throws IOException {
		System.out.println(id);
		System.out.println(ids);
		
		PrintWriter out = response.getWriter();
		out.print(id);
		out.print(ids);
	}
}
