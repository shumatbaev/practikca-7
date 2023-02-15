fun main(args: Array<String>) {
    println("Введите название пьесы")
    var name= readLine().toString()
    println("Введите начальное кол-во зрителей")
    var n1= readLine().toString().toInt()
    println("Введите конечное кол-во зрителей")
    var  n2= readLine().toString().toInt()
    println("Введите год выпуска пьесы")
    var year= readLine().toString().toInt()

    val spectacleYear = SpectacleYear(name,n1, n2, year)
    spectacleYear.printInfo()
}