fun main(){
    var text = "akirachix"
    var x=(text[0]) .toString() + (text[3]) + (text[4])
    println(x)


    var w = details( "Hilda" ,29)
    println(w)


    var y=l("shilamoses")
    println( y)

    detail("Hilda","ashlly")

    var f = result(23,45)
    println(f)
}
fun details(x: String, Y: Int): String {
    var name = x
    var age = Y
    var w = "Hi my name is $x i am $Y years old "
    return w
}
fun l(x:String):Int{
    return x.length
}
fun detail(Name:String,x:String) {
    if (Name == x) {
        println("That's me")
    } else {
        println("I dont know who that is")
    }
}
fun result(pass:Int,fail:Int): String {
    var f = "x"
    return f

}
