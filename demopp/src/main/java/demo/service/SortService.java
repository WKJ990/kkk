package demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.bean.Sort;
import demo.dao.SortDao;

/**
 * пео╒
 * @author wangkaijun
 *
 */
@Service("sortservice")
public class SortService {

	@Autowired
	private SortDao sortdao;
	
	@Transactional
	public void add(Object obj) {
		sortdao.add(obj);
	}
	
	@Transactional
	public List find(String hql) {
	  return	sortdao.find(hql);
	}
	@Transactional
	public Object load(Class claxx,Integer id) {
		return sortdao.load(claxx,id);
	}
	
	@Transactional
	public void del(Integer id) {
		sortdao.del(id);
	}
	
	@Transactional
	public void update(Object sort) {
		sortdao.update(sort);
	}
	

}
