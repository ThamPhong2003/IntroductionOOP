import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        //Giai phuong trinh bac 2
        //ax^2 +bx+c =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();
    if ( a == 0){
            double d = -c/b;
            System.out.println("Nghiem la x = " +d);
      }
    else {
        double delta = b*b - 4*a*c;
        if (delta > 0){
            
            double x1 = (-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
        else if (delta ==0){
                double x = -b/(2*a);
                System.out.println("x= " +x);
        }
        else { 
            System.out.println("Phuong trinh khong co nghiem thuc");
        }
    }
  }
}
