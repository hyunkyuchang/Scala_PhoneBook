object PhoneInfoFunction {
  private val pattern = "^\\d{3}-\\d{4}-\\d{4}$".r
  val PhoneBook:Map[String,PhoneInfo] = Map[String,PhoneInfo]().empty
  def chkPhoneNo(phoneNo:String):Boolean=
  {
    pattern.matches(phoneNo)
  }


}
