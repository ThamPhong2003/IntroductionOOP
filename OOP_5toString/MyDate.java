public class MyDate{
    private int day;
    private int month;
    private int year;
public MyDate( int day, int month, int year){
   if ( day > 0 && day <32){
        this.day = day;
   } else {
       this.day = 1;
   }
   if ( month >0 && month < 13 ){
     this.month = month;
   }
   else {
      this.month = 1;
   } 
   if ( year > 0){
    this.year = year;
   }
   else {
    this.year = 1;
   }
 }
 public double getDay(){
    return this.day;
 }
 public void setDay(int d){
    if ( d> 0 && d<32){
        this.day = d;
    } 
 }
 public double getMonth(){
    return this.month;
 }
 public void setMonth(int m){
    if ( m> 0 && m<13){
        this.month = m;
    } 
 } 
 public double getYear(){
         
    return this.year;
     
}
public void setYear(int y){
    if (y> 0){
        this.year = y;
    }
 }

 public String toString() {
     return this.day + "/" +this.month +"/"+ this.year; 
 }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MyDate)) {
            return false;
        }
        MyDate myDate = (MyDate) o;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

}

