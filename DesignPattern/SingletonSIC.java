/*
 * a simple implementation of Singletons by using
 * a static inner class
 *
 */
public class SingletonSIC {

  private SingletonSIC(){}

  private static class SingletonInstance {
    private static final SingletonSIC INSTANCE = new SingletonSIC();
  }

  public static SingletonSIC getInstance(){
    return SingletonInstance.INSTANCE;
  }
}
