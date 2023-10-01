import java.util.Scanner;

public class Point {
    private String name;
    private int x ; 
    private int y ;
    public Point () {
        this.name = "A";
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y){
        this.x= x;
        this.y = y;
    }
    public Point(String name, int x , int y){
        this.name = "A";
        this.x = x;
        this.y = y;
    }
    public int getX(){
            return x ; 
    }
    public int getY(){
        return y;
    }
    public void setX( int x){
        this.x = x;
    }
    public void setY (int y){
        this.y = y;
    }
    public void inputPoint(){
        Scanner sc = new Scanner(System.in);
        //
        System.out.println("Nhap ten diem: ");
        this.name = sc.nextLine();
        System.out.println("Nhap x: ");
        this.x = sc.nextInt();
        System.out.println("Nhap y: ");
        this.y = sc.nextInt();
    }
    public void printfPoint(){
        System.out.println(this.name+"("+this.x+";"+this.y+")");
    }
    public boolean equals (Point other) {
          return this.x == other.x && this.y == other.y;
    }
    
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2,4);
        Point p3 = new Point("A",2,41);

        Point p4 = new Point();
        p4.inputPoint();

        System.out.println("P1: ");
        p1.printfPoint();
        System.out.println("P2: ");
        p2.printfPoint();
        System.out.println("P3: ");
        p3.printfPoint();
        System.out.println("P4: ");
        p4.printfPoint();
       //
       System.out.println("2 doi tuong p1 va p2 bang nhau ?"+" "+ p1.equals(p2));
       System.out.println("2 doi tuong p2 va p3 bang nhau ?"+" "+p2.equals(p3));


    }
}
