public class sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private tacGia tacGia;
public sach (String tenSach , double giaBan , int namXuatBan, tacGia tenTacGia){
    this.tenSach = tenSach ;
    this.giaBan = giaBan;
    this.namXuatBan =namXuatBan;
    this.tacGia=tenTacGia ;
}
public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public tacGia getTacGia() {
		return tacGia;
	}

	public void setTacGia(tacGia tacGia) {
		this.tacGia = tacGia;
	}
public void inTenSach(){
    System.out.println(this.tenSach);
 }
}

