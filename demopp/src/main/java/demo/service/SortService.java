package demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


import demo.dao.SortDao;

/**
 * пео╒
 * @author wangkaijun
 *
 */
@Service("empservice")
public class SortService {

	@Autowired
	private SortDao empdao;
	
	@Transactional
	public void add(Object obj) {
		empdao.add(obj);
	}
	
	@Transactional
	public List find(String hql) {
	  return	empdao.find(hql);
	}
	@Transactional
	public List load(Class claxx,Integer id) {
		return empdao.load(claxx,id);
	}
	

}
