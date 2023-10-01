public class test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(24, 02, 2003);
        tacGia tg1 = new tacGia ("ThamPhong", ngay1);
        sach s1 = new sach("Harry Potter", 500000, 2023, tg1);
        s1.inTenSach();
    }
}
