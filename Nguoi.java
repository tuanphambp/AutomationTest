package day5_inheritance;

public abstract class Nguoi {
private String hoten;
private String diaChi;
private String ngaySinh;
public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public String getDiaChi() {
	return diaChi;
}
public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}
public String getNgaySinh() {
	return ngaySinh;
}
public void setNgaySinh(String ngaySinh) {
	this.ngaySinh = ngaySinh;
}
public void diChoi()
{
	System.out.println("Di choi khi co tien");
}

}
