package demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ϵͳ����Ա��Ϣ��
 * @author wangkaijun
 *
 */
@Entity
@Table(name="admin")
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer aid;//id
	private String username;//�û���
	private String password;//������
	private Integer permissions;//Ȩ��
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getPermissions() {
		return permissions;
	}
	public void setPermissions(Integer permissions) {
		this.permissions = permissions;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", username=" + username + ", password=" + password + ", permissions="
				+ permissions + "]";
	}
	
	
}
