public interface Stakkable {
    boolean isEmpty();
    Stakkable push(int value);
    Stakkable pop();
    int top();
}
