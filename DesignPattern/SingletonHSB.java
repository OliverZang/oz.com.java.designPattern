/*
 * A simple implementation of Singleton pattern
 * by using a static code block
 */

public class SingletonHSB{
  private static Singleton instance;
  static {
    instance = new SingletonHSB();
  }

  private SingletonHSB(){}

  public static SingletonHSB getInstance(){
    return instance;
  }
}
