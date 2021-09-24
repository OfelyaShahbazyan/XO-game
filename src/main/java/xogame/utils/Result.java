package xogame.utils;

public class Result<V> {
  public final V value;
  public final boolean isSuccess;
  public final String errorMessage;

  public Result(V value) {
    this.value = value;
    this.isSuccess = true;
    this.errorMessage = "";
  }

  public Result(V value, String errorMessage) {
    this.value = value;
    this.isSuccess = false;
    this.errorMessage = errorMessage;
  }

  public Result(String errorMessage) {
    this.value = null;
    this.isSuccess = false;
    this.errorMessage = errorMessage;
  }
}