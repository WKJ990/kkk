package demo.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 订单信息表
 * @author wangkaijun
 *
 */

@Entity
@Table(name="orders")
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer oid;//订单ID
	private String oNO;//订单编号
	private Integer userId;//下单人 ID
	private String sendName;//寄件人姓名
	private String sendAdress;//寄件人地址
	private String sendTel;//寄件人电话
	private Date sendTime;//寄件时间
	private String payment;//付款方式
	private String state;//快件状态
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getoNO() {
		return oNO;
	}
	public void setoNO(String oNO) {
		this.oNO = oNO;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getSendName() {
		return sendName;
	}
	public void setSendName(String sendName) {
		this.sendName = sendName;
	}
	public String getSendAdress() {
		return sendAdress;
	}
	public void setSendAdress(String sendAdress) {
		this.sendAdress = sendAdress;
	}
	public String getSendTel() {
		return sendTel;
	}
	public void setSendTel(String sendTel) {
		this.sendTel = sendTel;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", oNO=" + oNO + ", userId=" + userId + ", sendName=" + sendName + ", sendAdress="
				+ sendAdress + ", sendTel=" + sendTel + ", sendTime=" + sendTime + ", payment=" + payment + ", state="
				+ state + "]";
	}
	
	
}
