package demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="photo")
public class Photo {

	private String pphoto1;//Í¼Æ¬Â·¾¶
	private String pphoto2;//Í¼Æ¬Â·¾¶
	private String pphoto3;//Í¼Æ¬Â·¾¶
	private String pphoto4;//Í¼Æ¬Â·¾¶
	@Id
	private Integer pid; //Íâ¼ü
	public String getPphoto1() {
		return pphoto1;
	}

	public void setPphoto1(String pphoto1) {
		this.pphoto1 = pphoto1;
	}

	public String getPphoto2() {
		return pphoto2;
	}

	public void setPphoto2(String pphoto2) {
		this.pphoto2 = pphoto2;
	}

	public String getPphoto3() {
		return pphoto3;
	}

	public void setPphoto3(String pphoto3) {
		this.pphoto3 = pphoto3;
	}

	public String getPphoto4() {
		return pphoto4;
	}

	public void setPphoto4(String pphoto4) {
		this.pphoto4 = pphoto4;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Photo [pphoto1=" + pphoto1 + ", pphoto2=" + pphoto2 + ", pphoto3=" + pphoto3 + ", pphoto4=" + pphoto4
				+ ", pid=" + pid + "]";
	}

	

	
	
	
	
	
}
