package BT1;
public class test {
    public static void main(String[] args) {
        MyDate md = new MyDate(32, 03, 2023);
        md.setDay(24);
        md.setMonth(2);
        md.setYear(2003);
        System.out.println("Day: "+md.getDay());
        System.out.println("month: "+md.getMonth());
        System.out.println("Year: "+md.getYear());
        System.out.println("Birth: "+md.getDay()+"-"+md.getMonth()+"-"+md.getYear());
    }
}
