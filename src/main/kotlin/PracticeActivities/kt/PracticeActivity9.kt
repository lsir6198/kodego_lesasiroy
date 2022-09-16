package PracticeActivities

fun main(){
    var mobilephone = MobilePhone("Oppo",5.1, "ColorOS", "32GB", "3GB")
    var mobilefunctions = mapOf(1 to "Call", 2 to "Text / Chat", 3 to "Surfing", 4 to "Games", 5 to "Video Call")

    println("Functions:")
    for (value in mobilefunctions.values){
        println(value)
    }
    print("Choose a function:")
    var functionvalue = readln()
    if(functionvalue == mobilefunctions[1]){
        println(mobilephone.MobileCalls())
    }
    else if (functionvalue == mobilefunctions[2]){
        println(mobilephone.MobileTextandChat())
    }
    else if (functionvalue == mobilefunctions[3]){
        println(mobilephone.MobileSurf())
    }
    else if (functionvalue == mobilefunctions[4]){
        println(mobilephone.MobileGames())
    }
    else if (functionvalue == mobilefunctions[5]){
        println(mobilephone.MobileVideoCall())
    }
    else{
        println("Not in the option")
    }
}

class MobilePhone(var mobileDeviceName:String, var mobileAndroidVer:Double, var mobileOS:String, var mobileROM:String, var mobileRAM:String) {
    init {
        println("Mobile Phone System")
        println()
        println("Mobile Name is $mobileDeviceName")
        println("Mobile Android Version is $mobileAndroidVer")
        println("Mobile OS is $mobileOS")
        println("Mobile ROM is $mobileROM")
        println("Mobile RAM is $mobileRAM")
        println()
    }

        fun MobileCalls() {
            println("Type the Phone number you want to call:")
            var phonenumber: Double = readln().toDouble()
            println("Call Connected")
        }

        fun MobileTextandChat() {
            println("Type your message")
            var message = readln()
            println("Message Sent")
        }

        fun MobileSurf() {
            println("Connected. You can now go Online")
        }

        fun MobileGames() {
            println("You can now play games")
        }

        fun MobileVideoCall() {
            println("You can now start a video call")
        }

}
