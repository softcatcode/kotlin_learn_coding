import java.lang.Math.sin

interface GeomShape
{
    fun print_properties(area: Double)
    fun area(): Double
}

class Parallelogram(x: Double, y: Double, a: Double): GeomShape
{
    var x: Double
    var y: Double
    var a: Double

    init {
        this.x = x
        this.y = y
        this.a = a
    }

    override fun print_properties(area: Double) {
        println("Oposite sides are parallel.")
        println("Oposite angles are equal.")
        println("Oposite sides are equal")
    }

    override fun area(): Double {
        return x * y * sin(a)
    }
}

fun main()
{
    var paral = Parallelogram(1.0, 2.0, 3.14159265358979 / 6)
    print(paral.area())
}
