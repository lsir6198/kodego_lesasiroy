fun main(){
    var number: Int = 9

    if (number < 10) {
        println("Hello")
        println("Line ends")
    }

    var grade : Int = 100

      if ((grade >= 75) && (grade <= 100)) {
        println("1.75")
    } else if ((grade >= 76) && (grade <= 85)) {
        println("5.0")
    } else {
        println("Invalid grade!")
    }
    //range
    var idNumber : Int = 1
    if((idNumber >=1)&&(idNumber <=3)) {
        println("valid id number")
        println("Success!!!")
    }
    var gender : String = "X"
    if(gender == "M"){
        println("Male")

    }else if(gender == "F"){
        println("Female")
    }else{
        println("Invalid Gender")
    }
}


