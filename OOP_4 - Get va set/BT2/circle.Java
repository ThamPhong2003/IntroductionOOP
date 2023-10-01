public class circle {
    private double bankinh;
public circle (double bankinh){
    if ( bankinh > 0){
        this.bankinh = bankinh;
    }
    else {
        this.bankinh = 0;
    }
 }
public double getS(){
    return this.bankinh*this.bankinh*3.14;
}
public void setS( int r ){
    if ( r > 0){
        this.bankinh = r;
    }
    else {
        this.bankinh = 0;
    }
}
public double getC(){
    return 2*3.14*this.bankinh;
}
public void setC(int r){
    if ( r > 0){
        this.bankinh = r;
    }
    else {
        this.bankinh = 0;
    }
}
}

