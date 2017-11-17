package demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Override
	public String toString() {
		return "Sort [sid=" + sid + ", sname=" + sname + ", sPhoto=" + sPhoto + "]";
	}
	
	
	
}
