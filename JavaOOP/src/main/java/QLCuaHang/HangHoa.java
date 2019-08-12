package QLCuaHang;
import QLCuaHang.NhomHang;
import QLCuaHang.LoaiHang;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="tbl_hanghoa",  uniqueConstraints = {@UniqueConstraint(columnNames = {"HH_ID"})})

public class HangHoa {
	private Integer HH_ID;
	private String HH_Ten;
	private Integer HH_Gia;
	private LoaiHang loaiHang1;
	public HangHoa() {
		
	}
	public HangHoa(LoaiHang ID_LH,Integer HH_ID,String HH_Ten,Integer HH_Gia) {
		this.loaiHang1 = ID_LH;
		this.HH_ID = HH_ID;
		this.HH_Ten = HH_Ten;
		this.HH_Gia = HH_Gia;
		
	}
	
	@Id
	@OneToMany
	@Column(name="HH_ID")
	public Integer GetHH_ID() {
		return HH_ID;
	}
	public void setHH_ID(Integer HH_ID) {
		this.HH_ID = HH_ID;
	}
	

	@ManyToOne
	@JoinColumn(name="ID_Loai")
	private QLCuaHang.LoaiHang Loai;
	public LoaiHang GetLoai() {
		return Loai;
	}
	public void setLoai(LoaiHang loai) {
		this.Loai = loai;
	}
	
	@Column(name="HH_Ten")
	public String GetHH_Ten() {
		return HH_Ten;
	}
	public void setHH_Ten(String HH_Ten) {
		this.HH_Ten = HH_Ten;
	}
	
	@Column(name="HH_Gia")
	public Integer GetHH_Gia() {
		return HH_Gia;
	}
	public void setHH_Gia(Integer HH_Gia) {
		this.HH_Gia = HH_Gia;
	}
}
