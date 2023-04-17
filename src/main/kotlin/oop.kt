class students{
    //member data
    val number:Int=9
    //member function
    fun  calculatesquare():Int{
        return number*number
    }
    fun calculatediffernce():Int{
        return number-number
    }
}
fun main(args: Array<String>) {
    //creating object
    val myobj=students()
        println(myobj.calculatesquare())
        println(myobj.calculatediffernce())
}

