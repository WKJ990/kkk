package demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pro_img")
public class Pro_img {
	@Id
	private Integer pid; //Íâ¼ü
	private String w_img;//Í¼Æ¬Â·¾¶
	private String s_img;//Í¼Æ¬Â·¾¶
	private String a_img;//Í¼Æ¬Â·¾¶
	private String d_img;//Í¼Æ¬Â·¾¶
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getW_img() {
		return w_img;
	}
	public void setW_img(String w_img) {
		this.w_img = w_img;
	}
	public String getS_img() {
		return s_img;
	}
	public void setS_img(String s_img) {
		this.s_img = s_img;
	}
	public String getA_img() {
		return a_img;
	}
	public void setA_img(String a_img) {
		this.a_img = a_img;
	}
	public String getD_img() {
		return d_img;
	}
	public void setD_img(String d_img) {
		this.d_img = d_img;
	}
	@Override
	public String toString() {
		return "Pro_img [pid=" + pid + ", w_img=" + w_img + ", s_img=" + s_img + ", a_img=" + a_img + ", d_img=" + d_img
				+ "]";
	}


	
}
