package demo.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ������Ŀ������
 * @author wangkaijun
 *
 */
@Entity
@Table(name="entry")
public class Entry {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eid;//ID
	private String oNo;//������� ���orders
	private Integer pid;//��Ʒid ��� product
	private Integer count;//��������
	private Date createtime;//����ʱ��
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getoNo() {
		return oNo;
	}
	public void setoNo(String oNo) {
		this.oNo = oNo;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "Entry [eid=" + eid + ", oNo=" + oNo + ", pid=" + pid + ", count=" + count + ", createtime=" + createtime
				+ "]";
	}
	
	
	
}
