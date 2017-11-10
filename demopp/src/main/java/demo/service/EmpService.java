package demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import demo.bean.Dept;
import demo.dao.EmpDao;

@Service("empservice")
public class EmpService {

	@Autowired
	private EmpDao empdao;
	
	@Transactional
	public void add(Object obj) {
		empdao.add(obj);
	}
	
	@Transactional
	public List find(String hql) {
	  return	empdao.find(hql);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/app-core.xml");
		
		EmpService emp = (EmpService)ctx.getBean("empservice");
		
		Dept d = new Dept();
		d.setDname("œ˙ €≤ø");
		
		emp.add(d);
		for(Object obj:emp.find("from Dept")) {
			System.out.println(obj);
		}
		
	}
}
