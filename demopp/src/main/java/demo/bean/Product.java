package demo.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ��Ʒ��Ϣ��
 * @author wangkaijun
 *
 */

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pid;//��ƷID
	private String pname;//��Ʒ����
	private Integer saleCount;//��������
	private String image;//��ƷͼƬ
	private Double price;//ԭ��
	private Double saleprice;//���ۼ۸�
	private String introduce;//����
	private Integer sid;//���sortsid
	
	@ManyToOne
	@JoinColumn(name="sid",insertable=false,updatable=false)
	private Sort sort;
	

	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getSaleCount() {
		return saleCount;
	}
	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(Double saleprice) {
		this.saleprice = saleprice;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	
	public Sort getSort() {
		return sort;
	}
	public void setSort(Sort sort) {
		this.sort = sort;
	}
	
	
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", saleCount=" + saleCount + ", image=" + image + ", price="
				+ price + ", saleprice=" + saleprice + ", introduce=" + introduce + ", sid=" + sid + "]";
	}
	
	
	
}
