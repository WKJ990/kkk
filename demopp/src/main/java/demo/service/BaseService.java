package demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


import demo.dao.BaseDao;

@Service("baseservice")
public class BaseService {
		@Autowired
	    private BaseDao dao;
		
		@Transactional
		public void add(Object obj){
			dao.add(obj);
		}
		@Transactional
		public void update(Object obj){
			dao.update(obj);
		}
		@Transactional
		public void delete(Object obj){
			dao.delete(obj);
		}
		@Transactional
		public Object load(Class claxx,Integer id){
			return dao.load(claxx, id);
		}
		public List  find(String hql) {
			return dao.find(hql);
		}
		public static void main(String[] args) {
			ApplicationContext ac = new ClassPathXmlApplicationContext("app-core.xml");
			BaseService service = ac.getBean(BaseService.class,"baseservice");
		
					
		}
}
