open class Myparentclass{
    val dad="He likes watching soccer"
    val mum="She likes cooking"
}
class Myboyclass: Myparentclass(){
    fun Myboy(){
        println(dad)
    }

}
class Mygirlclass:Myparentclass(){
    fun Mygirl(){
        println(mum)
    }

}

fun main(args: Array<String>) {
    val kijana=Myboyclass()
    kijana.Myboy()
}