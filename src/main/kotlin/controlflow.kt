fun main(args: Array<String>) {
//    if statements
//    if...else statement
//    if elseif...else statement
    var  num=5
    if (num<28){
        println("Its true")
    }else
        println("its false")
    var nambari =23
    if (nambari<0){
        println("it negative")
    }else if (nambari>0 && nambari>10){
        println("Its a single digit number")
    }else if (nambari>=10 && nambari<100){
        println("Its a double digit number")
    }else
        println("Number has 3 or more digits")
}