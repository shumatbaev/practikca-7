open class MobileOperator(val name: String, val Cost: Double, val square: Double) {
    open fun Q(): Double {
        return 100 * square / Cost
    }
    open fun printInfo() {
        println("Название оператора: $name")
        println("Стоимость 1 минуты разговора: $Cost")
        println("Площадь покрытия: $square")
        println("Качество: ${Q()}")
    }
}
class AdvOperator(name: String, Cost: Double, square: Double, val Connection:Int) :
    MobileOperator(name, Cost, square) {
        fun Qp(): Double {
            val baseQ = super.Q()
            return if (Connection==1) {
                0.7 * baseQ
            } else {
                1.5 * baseQ
            }
        }
            override fun printInfo() {
                println("Название оператора: $name")
                println("Стоимость 1 минуты разговора: $Cost")
                println("Площадь покрытия: $square")
                println("Качество: ${Q()}")
                println("Q: ${Qp()}")
            }
    }
