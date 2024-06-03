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
    None
  }
}
