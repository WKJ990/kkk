package demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.OrderDao;
/**
 * ¶©µ¥
 * @author wangkaijun
 *
 */
@Service("orderservice")
public class OrderService {

	@Autowired
	private OrderDao orderdao;
	
	@Transactional
	public void add(Object obj) {
		orderdao.add(obj);
	}
	
	@Transactional
	public List find(String hql) {
	  return	orderdao.find(hql);
	}
	
	@Transactional
	public Object load(Class claxx,Integer id) {
		return orderdao.load(claxx, id);
	}
	@Transactional
	public void update(Object obj) {
		orderdao.update(obj);
	}
}
