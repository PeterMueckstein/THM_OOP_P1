public class Point {
    private double x, y;
    Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    @Override public boolean equals(Object o){
        if (o == null){
            return false;
        }
        if (o == this){
            return true;
        }
        if (this.getClass() != o.getClass()){
            return false;
        }

        return this.x == ((Point)o).x && this.y ==((Point)o).y;
    }
}
