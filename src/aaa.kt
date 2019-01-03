
fun a(n:String):String{
	var temple = """
 ${n},${n.length}
 """
 return "${temple}"
}
fun main(args: Array<String>) {
	var b = a("15646546")
 println(b)
}