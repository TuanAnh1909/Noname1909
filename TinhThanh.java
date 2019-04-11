import java.io.Serializable;

public class TinhThanh implements Serializable {
	String tenTinh;
	int maTinh = 1;

	public String getTenTinh() {
		return tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}

	public int getMaTinh() {
		return maTinh;
	}

	public void setMaTinh(int maTinh) {
		this.maTinh = maTinh;
	}

	public TinhThanh(String tenTinh, int maTinh) {
		super();
		this.tenTinh = tenTinh;
		this.maTinh = maTinh;
	}

}
