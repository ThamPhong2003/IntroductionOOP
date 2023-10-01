import java.util.Scanner;
public class cacpheptoancoban {
    public static void main(String[] args) {
         // khai bao bien
         int a,b;
         // nhap du lieu
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap a: ");
         a = sc.nextInt();
         System.out.println("Nhap b: ");
         b =  sc.nextInt();
         int sum = a+b;
         int hieu = a- b;
         int tich = a*b;
         float thuong = (float) a/b;
         int mod = a%b;
         System.out.println("sum = "+sum);
         System.out.println("hieu = "+hieu);
         System.out.println("tich = "+tich);
         System.out.println("thuong = "+thuong);
         System.out.println("so du  = "+mod);

    }
    
}
