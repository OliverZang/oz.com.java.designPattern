/*
 * A phone factory that provides users with Android phones and Ios phones
 */
class PhoneFactory{
  public Phone getPhone(String phoneType){
    if (phoneType == null){
      return null;
    }
    if (phoneType.equalsIgnoreCase("ANDROID")){
      return new AndroidPhone();
    }
    else if (phoneType.equalsIgnoreCase("IOS")){
      return new IosPhone();
    }
    return null;
  }
  //users use PhoneFactory to create phones so as to use phone;
  public static void main(String[] args){
    PhoneFactory demo = new PhoneFactory();
    Phone phone = demo.getPhone("Ios");
    phone.usePhone();
  }
}

interface Phone{
  void usePhone();
}

class AndroidPhone implements Phone{
  public AndroidPhone(){}

  public void usePhone(){
    System.out.println("this is an Android Phone");
  }

}

class IosPhone implements Phone{
  public IosPhone(){}

  public void usePhone(){
    System.out.println("this is an IosPhone");
  }
}
