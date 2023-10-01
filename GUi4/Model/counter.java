package Model;

public class counter {
    private int value ;
public counter () {
    this.value = 0;
}
public int getValue (){
    return this.value; 
}
public void setValue ( int value ){
    this.value = value ;
}
public void increment() {
    this.value++;
}
public void decrement (){
    this.value-- ;
} 
public void reset (){
    this.value =0 ;
}
}
