package xogame.utils;

public class Failure<V> extends Result<V> {
    public Failure(V value, String errorMessage) {
        super(value, false, errorMessage);
    }

    public Failure(String errorMessage) {
        this(null, errorMessage);
    }
}
