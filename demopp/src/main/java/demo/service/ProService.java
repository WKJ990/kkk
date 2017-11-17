package demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.ProDao;

/**
 * пео╒
 * @author wangkaijun
 *
 */
@Service("proservice")
public class ProService {

	@Autowired
	private ProDao prodao;
	
	@Transactional
	public void add(Object obj) {
		prodao.add(obj);
	}
	
	@Transactional
	public List find(String hql) {
	  return	prodao.find(hql);
	}
}
