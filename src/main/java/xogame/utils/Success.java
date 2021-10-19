package xogame.utils;

public class Success<V> extends Result<V> {

    public Success(V value) {
        super(value, true, "");
    }
}
