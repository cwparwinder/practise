import java.util.Scanner
fun main()
{
    val reader = Scanner(System.`in`)
    var a:Int = reader.nextInt()
    
    when(a)
     {
        1->println("monday")
        2->println("tuesday")
        3->println("wednesday")
        4->println("thursday")
        5->println("friday")
        6->println("saturday")
        7->println("sunday")
        else->println("not a day")
     }
}