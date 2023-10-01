public class Ngay {
    private int ngay;
    private int thang;
    private int nam;
public Ngay ( int ngay, int thang, int nam){
    this.ngay = ngay;
    this.thang = thang;
    this.nam = nam;
}
public int getNgay(){
    return this.ngay ;
}
public void setNgay(int d){
    if (d>0 && d<32){
        this.ngay = d;
    }
}
public int getThang(){
    return this.thang;
}
public void setThang(int m){
    if ( m>0 && m<13){
        this.thang = m;
    }
}
public int getNam(){
    return this.nam;
}
public void setNam(int y){
    if (y>0){
        this.nam = y;
    }
}

}