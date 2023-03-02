fun main(){
val female= Human("Grace",15,55.5)

    female.eat(2)
    println()

    println(female.weight)
    println()

    female.speak("I love coding")
    println()

    female.birthday()
    println(female.age)

    val male = User("Grace","Wambui","graceshadrack01@gmail.com","0740348281","Grace2023")
    println(male.phoneNumber)
    println(male.email)



}
class Human(var name: String,var age: Int, var weight:Double){
    fun eat(foodWeight:Int){
        val eating = "I am eating $foodWeight kgs of food"
        weight += foodWeight
        println(eating)
    }
    fun speak(speech:String){
        println("$speech")

    }
    fun birthday(){
        val age = ++age

    }
}

data class User(var firstName:String,var lastname:String,var email:String,var phoneNumber:String, var password:String){

}





