import java.util.Scanner;
public class scanner {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    //Nhap ho va ten
    System.out.println("Nhap ho va ten: ");
    String hovaten = sc.nextLine();
    // Nhap mssv
    System.out.println("nhap ma sinh vien:  ");
    long mssv = sc.nextLong();
    // Nhap diem thi
    System.out.println("Nhap vao diem thi: ");
    int diemthi = sc.nextInt();
    //xuat thong tin
    System.out.println("Ho va ten la: "+ hovaten);
    System.out.println("Ma sinh vien la: " +mssv);
    System.out.println("diem thi la: "+diemthi);    
    }
}
