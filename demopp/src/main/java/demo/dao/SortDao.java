package demo.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import demo.bean.Sort;

/**
 * 类别
 * @author wangkaijun
 *
 */

@Component("sortdao")
public class SortDao extends HibernateDaoSupport {

	@Resource(name="sessionFactory")
	public void setFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	/**
	 * 添加
	 * @param obj
	 */
	@Transactional
	public void add(Object obj) {
		super.getHibernateTemplate().save(obj);
	}
	
	/**
	 * 查询
	 * @param hql
	 * @return
	 */
	@Transactional
	public List find(String hql) {
	  return	super.getHibernateTemplate().find(hql);
	}
	@Transactional
	public Object load(Class claxx,Integer id) {
		return super.getHibernateTemplate().get(claxx, id);
	}
	
	@Transactional
	public void del(Integer id) {
		Sort sort = new Sort();
		sort.setSid(id);
		super.getHibernateTemplate().delete(sort);
	}
	
	@Transactional
	public void update(Object sort) {
		super.getHibernateTemplate().update(sort);
	}
	
}
