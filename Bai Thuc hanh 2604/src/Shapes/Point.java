package Shapes;

public class Point {
    public double x;
    public double y;
    public char c;
    public String name;
    
    public double AB ,BC, AC,CD,DA;

    public Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getAB() {
        return AB;
    }

    public double getAC() {
        return AC;
    }
    public double getBC() {
        return BC;
    }

    public void setAB( double AB) {
        this.AB=AB;
    }
    public void setAC( double AC) {
        this.AC=AC;
    }
    public void setBC( double BC) {
        this.BC=BC;
    }
    
    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void setPointXY(String name,double x, double y){
        this.name=name;
        this.x = x;
        this.y = y;
    }

    public void setCXY(char c,double x,double y){
        this.c=c;
        this.x=x;
        this.y=y;
    }
     
    public void getPointXY(){
        System.out.println("Diem "+name+" co toa do la: " + name+"("+x  +";" +y+")");     
    }


}