package BT1;
public class MyDate{
    private int day;
    private int month;
    private int year;
public MyDate ( int day , int month, int year){
        if (day >0 && day<32 ){
            this.day= day;
        }
        if (month > 0 && month<13){
            this.month = month;
        }
        if (year >0 ){
            this.year =year ;
        }
    }
public int getDay(){
    return this.day;
}
public void setDay( int d){
    if ( d >0 && d< 32){
        this.day =d ;
    }
    else { 
        this.day =1;
    }
}
public int getMonth () {
    return this.month;
}
public void setMonth(int m){
    if ( m> 0 && m< 13){
        this.month = m;
    }
    else{
        this.month =1;
    }
}
public int getYear (){
    return this.year;
}
public void setYear (int y){
    if (y >0){
        this.year = y;
    }
    else {
        this.year =1;
    }
}
}
