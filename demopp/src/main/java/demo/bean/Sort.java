package demo.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * ������Ϣ��
 * @author wangkaijun
 *
 */
@Entity
@Table(name="sort")
public class Sort {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sid; //����id
	private String sname;//��������
	private String sPhoto;//·��
	private Integer sstate;//�h��
	@OneToMany(mappedBy="sort",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Set<Product> so = new HashSet<Product>();
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getsPhoto() {
		return sPhoto;
	}
	public void setsPhoto(String sPhoto) {
		this.sPhoto = sPhoto;
	}
	
	public Integer getSstate() {
		return sstate;
	}
	public void setSstate(Integer sstate) {
		this.sstate = sstate;
	}
	public Set<Product> getSo() {
		return so;
	}
	public void setSo(Set<Product> so) {
		this.so = so;
	}
	@Override
	public String toString() {
		return "Sort [sid=" + sid + ", sname=" + sname + ", sPhoto=" + sPhoto + "]";
	}
	
	
	
}
