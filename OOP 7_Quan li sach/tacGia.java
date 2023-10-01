public class tacGia {
    private String tenTacGia;
    private Ngay ngaySinh;
public tacGia(String tenTacGia, Ngay ngaySinh){
    this.tenTacGia = tenTacGia;
    this.ngaySinh = ngaySinh ;
}
public String getTenTG(){
    return this.tenTacGia;
}
public void setTenTG( String name){
    this.tenTacGia = name;
}
public Ngay ngaySinh(){
    return this.ngaySinh;
}
public void setngaySinh( Ngay birth){
    this.ngaySinh = birth;
}
}
