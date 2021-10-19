package xogame.utils;

public abstract class Result<V> {
  public final V value;
  public final boolean isSuccess;
  public final String errorMessage;

  public Result(V value, boolean isSuccess, String errorMessage) {
    this.value = value;
    this.isSuccess = isSuccess;
    this.errorMessage = errorMessage;
  }
}
