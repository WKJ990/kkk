package demo.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 订单条目描述表
 * @author wangkaijun
 *
 */
@Entity
@Table(name="entry")
public class Entry {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eid;//ID
	private String oNo;//订单编号 外键orders
	private Integer pid;//商品id 外键 product
	private Integer count;//购买数量
	private Date createtime;//购买时间
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
