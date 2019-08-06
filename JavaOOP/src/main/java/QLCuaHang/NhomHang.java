package QLCuaHang;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="tbl_nhomhang",  uniqueConstraints = {@UniqueConstraint(columnNames = {"NH_ID"})})
public class NhomHang {
private Integer NHID;
private String NH_Ten;
private Set<LoaiHang> LHang = new HashSet<LoaiHang>(0);

	public NhomHang() {
		
	}
	public NhomHang(Integer ID,String TenNH) {
	
			this.NHID = ID;
			this.NH_Ten = TenNH;
		
	}
	@Id
	@OneToMany
	@Column(name="ID_NH")
	public Integer GetNHID(){
		return NHID;
	}
	public void SetIDNH(Integer NHID) {
		this.NHID = NHID;
	}
	@Column(name="Ten_NH")
		public String GetTenNH() {
		return NH_Ten;
	}
		public void SetTenNH(String TenNH) {
			this.NH_Ten = TenNH;		}
	

}
