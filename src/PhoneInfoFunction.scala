object PhoneInfoFunction {
  private val pattern = "^\\d{3}-\\d{4}-\\d{4}$".r
  //전화번호, 정보
  val phoneBook:Map[String,PhoneInfo] = Map[String,PhoneInfo]().empty
  //이름, 정보
  val nameIndex:Map[String,PhoneInfo] = Map[String,PhoneInfo]().empty
  def chkPhoneNo(phoneNo:String):Boolean=
  {
    pattern.matches(phoneNo)
  }
  def addPhone(name:String,addr:String,phoneNo:String): Unit = {
    val phoneInfo = PhoneInfo(name, addr, phoneNo)
    if(phoneInfo.isDefined){
    }
  }

}
