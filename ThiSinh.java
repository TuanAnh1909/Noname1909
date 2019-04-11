import java.io.Serializable;

public class ThiSinh implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int maThiSinh = 10000;
	String tenThiSinh;
	int maQueQuan;
	String ngayThangNam;
	boolean gioiTinh;
	float diemToan;
	float diemLy;
	float diemHoa;

	public ThiSinh(int maThiSinh, String tenThiSinh,int maQueQuan, String ngayThangNam, boolean gioiTinh,
			float diemToan, float diemLy, float diemHoa) {
		super();
		this.maThiSinh = maThiSinh;
		this.tenThiSinh = tenThiSinh;
		this.maQueQuan = maQueQuan;
		this.ngayThangNam = ngayThangNam;
		this.gioiTinh = gioiTinh;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public int getMaThiSinh() {
		return maThiSinh;
	}

	public void setMaThiSinh(int maThiSinh) {
		this.maThiSinh = maThiSinh;
	}

	public String getTenThiSinh() {
		return tenThiSinh;
	}

	public void setTenThiSinh(String tenThiSinh) {
		this.tenThiSinh = tenThiSinh;
	}

	public int getMaQueQuan() {
		return maQueQuan;
	}

	public void setMaQueQuan(int maQueQuan) {
		this.maQueQuan = maQueQuan;
	}

	public String getNgayThangNam() {
		return ngayThangNam;
	}

	public void setNgayThangNam(String ngayThangNam) {
		this.ngayThangNam = ngayThangNam;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
