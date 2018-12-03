/*
 * A simple implementation of singleton pattern
 * using a final static variable 
 */
public class SingletonH {
  //ensure only one instance of the singleton class ever exists
  private final static SingletonH INSTANCE = new SingletonH();

  private SingletonH(){}
  //provide global access to that instance
  public static SingletonH getInstance(){
    return INSTANCE;
  }
}
