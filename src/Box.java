public class Box<T> {
    T thing;
    static int count;
    public Box(T thing){
        this.thing = thing;
        count ++;
    }

    @Override
    public String toString() {
        return "Hallo " + thing;
    }
}
