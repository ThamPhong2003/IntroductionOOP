import java.util.Scanner;
public class mang {
    public static void main(String[] args) 
    {              
        double tong =0;
        double [] mang1 ;
        mang1 = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i =0 ; i<mang1.length; i++){
            System.out.println("Nhap phan tu thu " + i +  ":");
            mang1[i] = sc.nextDouble();
        }
        for (int i =0 ; i< mang1.length; i++){
            System.out.println("Tong cac so trong mang la:");
            tong +=mang1[i];
        }
        System.out.println(" " +tong );    
    }

}