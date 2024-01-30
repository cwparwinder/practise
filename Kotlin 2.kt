import java.util.Scanner
fun main()
{
    val reader = Scanner(System.`in`)
    print("enter number1")
    var a:Int = reader.nextInt()
    println("$a")
    print("enter number2")
    var b:Int = reader.nextInt()
    println("$b")
    print("operation") 
    var op:String = reader.next()
    
    when(op)
     {
       "+"->print(a+b)
       "-"->print(a-b)
       "*"->print(a*b)
       "/"->print(a/b)
       else->println("invalid operation")
     }
}