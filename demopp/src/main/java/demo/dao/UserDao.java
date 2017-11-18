package demo.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

/**
 * �û�
 * @author wangkaijun
 *
 */
@Component("userdao")
public class UserDao extends HibernateDaoSupport {

	@Resource(name="sessionFactory")
	public void setFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	/**
	 * ���
	 * @param obj
	 */
	@Transactional
	public void add(Object obj) {
		super.getHibernateTemplate().save(obj);
	}
	
	/**
	 * ��ѯ
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
	public void update(Object obj) {
		super.getHibernateTemplate().update(obj);
	}
	
}
