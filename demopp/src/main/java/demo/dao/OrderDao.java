package demo.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

/**
 * ∂©µ•
 * @author wangkaijun
 *
 */

@Component("orderdao")
public class OrderDao extends HibernateDaoSupport {

	@Resource(name="sessionFactory")
	public void setFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	/**
	 * ÃÌº”
	 * @param obj
	 */
	@Transactional
	public void add(Object obj) {
		super.getHibernateTemplate().save(obj);
	}
	
	/**
	 * ≤È—Ø
	 * @param hql
	 * @return
	 */
	@Transactional
	public List find(String hql) {
	  return	super.getHibernateTemplate().find(hql);
	}
}
