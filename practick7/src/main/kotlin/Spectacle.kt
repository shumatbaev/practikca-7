open class Spectacle(val name: String, val n1: Int, val n2: Int) {
    open fun quality(): Double {
        return (n2 - n1) / n1.toDouble()
    }

}
class SpectacleYear(name: String, n1: Int, n2: Int, val year: Int) : Spectacle(name, n1, n2){
        fun Q(): Double {
        val T = 2023
        val P = year
        return super.quality() * (T - P + 1)
    }
    fun printInfo() {
        println("Спектакль \"$name\"")
        println("Год написания пьесы: $year")
        println("Начальное число зрителей: $n1")
        println("Конечное число зрителей: $n2")
        println("Качество спектакля: ${quality()}")
        println("Q: ${Q()}")
    }
}