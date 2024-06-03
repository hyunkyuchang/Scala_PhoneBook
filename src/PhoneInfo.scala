class PhoneInfo private (private var name:String, private var addr:String,private var phoneNo:String) {
  override def toString: String = {
    s"Name: $name / Address: $addr / Phone No:$phoneNo"
  }
  //getter
  def getName:String = name
  def getAddr:String = addr
  def getPhoneNo:String = phoneNo

  //Setter
  def changeInfo(name:String,addr:String,phoneNo:String):Unit={
    if(!name.isBlank){
      this.name = name
    }
    if(!addr.isBlank){
      this.addr=addr
    }
    if(!addr.isBlank && PhoneInfoFunction.chkPhoneNo(phoneNo)){
      this.phoneNo = phoneNo
    }
  }
}
object PhoneInfo {
  def apply(name: String, addr: String, phoneNo: String): Option[PhoneInfo] = {
    //check 로직
    if(name.isBlank||addr.isBlank||phoneNo.isBlank) {
      println("필수 값이 비어 있습니다.")
      None
    }
    if(!PhoneInfoFunction.chkPhoneNo(phoneNo)) {
      println("전화번호 양식이 틀립니다.\n000-0000-0000 형식으로 입력해 주시기 바랍니다.")
      None
    }
    if(!PhoneInfoFunction.phoneBook.contains(phoneNo)) {
      println("이미 등록된 전화번호 입니다.")
      None
    } else{
      this(name,addr,phoneNo)
    }
  }
}
