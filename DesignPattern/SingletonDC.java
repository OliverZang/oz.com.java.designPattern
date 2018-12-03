/* a simple implmentation of singletons by using
 * double check if an instance already exists
 */
public class SingletonDC{

  private static SingletonDC singleton;

  private SingletonDC(){}

  public static SingletonDC getInstance(){
    if (singleton == null){
      synchronized (Singleton.class){
        if (singleton == null){
          singelton = new SingletonDC();
        }
      }
    }
    return singleton;
  }
}
