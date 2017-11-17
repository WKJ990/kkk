package demo.bean;

import java.util.Date;

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
@Table(name="orders")
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer oid;//����ID
	private String oNO;//�������
	private Integer userId;//�µ��� ID
	private String sendName;//�ļ�������
	private String sendAdress;//�ļ��˵�ַ
	private String sendTel;//�ļ��˵绰
	private Date sendTime;//�ļ�ʱ��
	private String payment;//���ʽ
	private String state;//���״̬
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
