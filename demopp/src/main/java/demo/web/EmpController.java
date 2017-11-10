package demo.web;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.bean.Emp;
import demo.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService emp;
	
	@RequestMapping("/list")
	@ResponseBody
	public Object  list() {
		String hql = "select e from Emp e where 1=1";
		
		return emp.find(hql);
		
		
	}
	
	@RequestMapping(value="/deptlist")
	@ResponseBody
	public Object deptlist(){
		String hql = "from Dept";
		return emp.find(hql);
	}
	
	@RequestMapping(value="/add")
	@ResponseBody
	public Object add(Emp emps){
		
		System.out.println("Ìí¼Ó"+emps);
//		Dept dept = (Dept)emp.load(Dept.class, emps.getDeptid());
//		emp.setDept(dept);
		emp.add(emps);
		Map<String,Object> data = new HashMap<String,Object>();
		
		data.put("result", "OK");

		return data;
	}
	
	
//	@RequestMapping("/toadd")
//	public ModelAndView toadd() {
//		ModelAndView mv = new ModelAndView();
//		
//		mv.addObject("deptlist", emp.find("from Dept"));
//		mv.setViewName("/add");
//		return mv;
//	}
//	
//	@RequestMapping("/add")
//	public ModelAndView add(Emp emps) {
//		ModelAndView mv = new ModelAndView();
//		emp.add(emps);
//		
//		mv.setViewName("redirect:/list.sw");
//		return mv;
//	}
}
