public class MainClass{
    public static void main(String[] args){
     System.out.println("begin");
     try {
        int i = 5/0 ; 
        System.out.println("try");
     } catch (Exception e) {
        System.out.println("catch");
          } finally {
        System.out.println("finaly");
     }
     System.out.println("end");
}
}