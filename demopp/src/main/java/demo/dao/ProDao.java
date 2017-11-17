package demo.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

/**
 * 信息
 * @author wangkaijun
 *
 */
@Component("prodao")
public class ProDao extends HibernateDaoSupport {

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
}
