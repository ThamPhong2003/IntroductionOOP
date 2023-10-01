public class hoadoncaphe{
    private String tenloaicaphe;
    private double giatien1kg;
    private double khoiluong;
public hoadoncaphe( String t, double g, double k){
    this.tenloaicaphe = t;
    this.giatien1kg = g;
    this.khoiluong = k;
    }
public double tinhtongtien(){
    return this.giatien1kg * this.khoiluong;  
  }
public boolean kiemtrakhoiluong(double kl){
       /*  if (this.khoiluong > kl){
            return true;
        }
        else {
            return false ;
        } */
        return this.khoiluong > kl;
}
public boolean kiemtratongtien( double tt){
    return this.giatien1kg*this.khoiluong > tt;
}
public double giamgia(double x){
    if ( this.tinhtongtien() > 500){
    return (x/100)*this.tinhtongtien();
    } 
    else return 0;
}
public double sotienphaitra(double x){
    return this.tinhtongtien() - this.giamgia(x);
 }
}