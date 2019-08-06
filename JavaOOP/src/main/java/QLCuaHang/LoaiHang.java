package QLCuaHang;
import QLCuaHang.NhomHang;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="tbl_loaihang",  uniqueConstraints = {@UniqueConstraint(columnNames = {"LH_ID"})})
public class LoaiHang {

	
	private Integer LH_ID;
	private String LH_Ten;
	private Set<HangHoa> HangHoa = new HashSet<HangHoa>(0);
	

		public LoaiHang() {
			
		}
		public LoaiHang(Integer IDNH,Integer ID,String TenLH) {
				NhomHang. = IDNH;
				this.LH_ID = ID;
				this.LH_Ten = TenLH;
			
		}
		@Id
		@OneToMany
		@Column(name="LH_ID")
		public Integer GetLH_ID(){
			return LH_ID;
		}
		public void SetLH_ID(Integer LH_ID) {
			this.LH_ID = LH_ID;
		} // ID Loại Hàng
		
		public String GetTenLH() {
			return LH_Ten;
		}
		public void SetTenLH(String LH_ten) {
			this.LH_Ten = LH_ten;
		} // Tên Loại Hàng
		
		@Id
		@Column(name="ID_Nhom")
		public Integer Get

	}
	

