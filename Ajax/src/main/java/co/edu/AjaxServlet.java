package co.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class AjaxServlet
 */
@WebServlet({ "/AjaxServlet", "/ajax.do" })
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 헤드의 메타 데이터 설정
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		String job = request.getParameter("job");
		PrintWriter out = response.getWriter(); // 출력 스트림
		
		if(job.equals("html")) {
			out.print("<h3>ajax 페이지 입니다</h3>");
			out.print("<a href='index.html'>첫페이지로</a>");			
		} else if(job.equals("json")) {
			// [ {"a":?,...} , {} , {} ] 형식.
			EmpDAO dao = new EmpDAO();
			List<Employees> list = dao.empList();
//			String json = "[";
//			for(int i=0; i<list.size(); i++) {
//				json += "{\"first_name\":"+list.get(i).getFirstName()+"}";
//				if(i != list.size()-1) {
//					json += ",";
//				}
//			}
//			json += "]";
			Gson json = new GsonBuilder().create();
			out.print(json.toJson(list));
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
//		response.
		
		String cmd = request.getParameter("cmd");
		
		String empId = request.getParameter("empId");
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String email = request.getParameter("email");
		String hireDate = request.getParameter("hireDate");
		String jobId = request.getParameter("jobId");
//		int empId2 = Integer.parseInt(empId);
		
		Employees emp = new Employees();
//		emp.setEmployeeId(empId2);
		emp.setFirstName(fname);
		emp.setLastName(lname);
		emp.setEmail(email);
		emp.setHireDate(hireDate);
		emp.setJobId(jobId);
		
//		EmpDAO dao = new EmpDAO();
//		dao.insertEmp(emp);
		
		// 등록
		if(cmd.equals("insert")) {
			EmpDAO dao2 = new EmpDAO();
			dao2.insertEmp(emp);
		} else if(cmd.equals("update")) {  // 수정
			EmpDAO dao2 = new EmpDAO();
			dao2.updateEmp(emp);
			if(dao2.updateEmp(emp)== null) {
				System.out.println("NULL");
			} else {
				System.out.println("Success");
			}
		} else if(cmd.equals("delete")) {
			EmpDAO dao2 = new EmpDAO();
			emp.setEmployeeId(Integer.parseInt(empId));
			dao2.deleteEmp(emp);
			if(dao2.deleteEmp(emp)== null) {
				System.out.println("NULL");
			} else {
				System.out.println("Success");
			}
		}
		
		
		System.out.println(emp);
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(emp));
	}

}
