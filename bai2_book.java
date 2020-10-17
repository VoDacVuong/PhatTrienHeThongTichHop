package bai2RMI;

public class bai2_book {
	private  String tenSach;
	private String tenTacGia;
	private String maSach;
	public bai2_book(String tenSach, String tenTacGia, String maSach) {
		super();
		this.tenSach = tenSach;
		this.tenTacGia = tenTacGia;
		this.maSach = maSach;
	}
	public bai2_book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.format("%10s %10s %10s",tenSach,tenTacGia,maSach);
		}

}
