package demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户基本信息表
 * @author wangkaijun
 *
 */
@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer uid;//用户ID
	private String username;//用户名
	private String password;//密码
	private String realName;//真是姓名
	private String tel;//联系电话
	private String address;//地址
	private String postcode;//邮编
	private String userPhoto;//用户图片 路径
	private String userGrade;//用户等级
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
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
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	public String getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", username=" + username + ", password=" + password + ", realName=" + realName
				+ ", tel=" + tel + ", address=" + address + ", postcode=" + postcode + ", userPhoto=" + userPhoto
				+ ", userGrade=" + userGrade + "]";
	}
	
	
}
