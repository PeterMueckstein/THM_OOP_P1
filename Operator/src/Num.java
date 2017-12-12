public class Num extends Expr {
    Integer value;
    Num(Integer value){
        this.value = value;
        order = 0;
    }

    @Override
    public String toString() {
        return value.toString();
    }
    static Num of(Integer value){
        return new Num(value);
    }
}
