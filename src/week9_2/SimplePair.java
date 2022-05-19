package week9_2;

public class SimplePair<T> {
    T x;
    T y;

    SimplePair(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getFirst(){
        return x;
    }

    public T getSecond(){
        return y;
    }
}
