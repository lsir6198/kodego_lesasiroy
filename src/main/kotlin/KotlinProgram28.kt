fun main(){
    var myCar = Car()
  //  myCar.checkfuel()
  //  myCar.accelerate(20)
  //  myCar.checkfuel()
    myCar.fuelVolume = 100
    println(myCar.fuelVolume)
}

class Car{
    var modelName:String = ""
        get() = field
        set(value){
            field = value
        }

    var fuelVolume:Int = 0
        get() = field
        set(value) {
            if(value < 0){
                println("invalid value")
            }
            else {
                field = value
            }
        }
    init {
        println("Object Created")
        println("Model Name is $modelName")
        println("Fuel Volume is $fuelVolume")
    }
    fun accelerate(fuelVolume: Int){
        this.fuelVolume = this.fuelVolume - fuelVolume
    }
    fun checkfuel(){
        println("Current fuel volume is $fuelVolume")
    }
}
