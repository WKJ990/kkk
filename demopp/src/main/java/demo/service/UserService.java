package demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.UserDao;
/**
 * ”√ªß
 * @author wangkaijun
 *
 */
@Service("userservice")
public class UserService {

	@Autowired
	private UserDao userdao;
	
	@Transactional
	public void add(Object obj) {
		userdao.add(obj);
	}
	
	@Transactional
	public List find(String hql) {
	  return	userdao.find(hql);
	}
	
	@Transactional
	public Object load(Class claxx,Integer id) {
		return userdao.load(claxx, id);
	}
	@Transactional
	public void update(Object obj) {
		userdao.update(obj);
	}
}
