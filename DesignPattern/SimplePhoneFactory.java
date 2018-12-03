class SimplePhoneFactory{
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

  public static void main(String[] args){
    SimplePhoneFactory demo = new SimplePhoneFactory();
    Phone phone = demo.getPhone("Ios");
    phone.usePhone();
  }
}

interface Phone{
  void usePhone();
}

class AndroidPhone implements Phone{
  private String color;
  public AndroidPhone(){}

  public void usePhone(){
    System.out.println("this is an Android Phone");
  }
}

class IosPhone implements Phone{
  private String color;
  public IosPhone(){}

  public void usePhone(){
    System.out.println("this is an IosPhone");
  }
}
