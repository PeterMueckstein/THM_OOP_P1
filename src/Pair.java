public class Pair<T,U> {
    T first;
    T l1;
    T l2;
    T l3;
    U second;
    Pair(T first,U second){
        this.first = first;
        this.second = second;
    }

    public void setL1(T l1) {
        this.l1 = l1;
    }

    public void setL2(T l2) {
        this.l2 = l2;
    }

    public void setL3(T l3) {
        this.l3 = l3;
    }
    public String istrue(){
        if (l1.getClass() == l2.getClass()){
            return "l1 entspricht l2";
        }
        return "nicht true";
    }

    @Override
    public String toString() {
        return first + "\n" + second;
    }
}
