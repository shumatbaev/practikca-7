fun main(args: Array<String>){
    println("Название оператора")
var name= readLine().toString()
    println("Стоимость 1 минуты разговора")
    var Cost= readLine().toString().toDouble()
    println("Площадь покрытия")
    var square= readLine().toString().toDouble()
    println("Плата за подключение 1-Да 2-Нет")
    var Connection= readLine().toString().toInt()
    val operator1 = MobileOperator(name, Cost, square)
    val operator2=AdvOperator(name, Cost, square,Connection)
    operator2.printInfo()
}