import java.util.Scanner;
public class toantudieukien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = sc.nextInt();
        String ketqua = (a%2==0)?"so chan":"so le";
        System.out.println("a la "+ketqua);

    }
}
