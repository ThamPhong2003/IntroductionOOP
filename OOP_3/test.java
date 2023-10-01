public class test {
    public static void main(String[] args) {
        hoadoncaphe hd = new hoadoncaphe( "caphetrungnguyen" , 150 , 4);
        System.out.println("Tong tien phai tra: "+hd.tinhtongtien());
        System.out.println("Kiem tra tong tien co lon hon 500 khong: "+hd.kiemtratongtien(500));
        System.out.println("So tien duoc giam la: "+hd.giamgia(10));
        System.out.println("So tien phai tra la: "+hd.sotienphaitra(10));
    }
}
