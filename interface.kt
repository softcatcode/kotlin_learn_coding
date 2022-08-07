import java.lang.Math.sin

interface GeomShape
{
    // functions may be implemented in interface
    fun printProperties()
    {
        println("Properties:")
    }
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

    override fun printProperties() {
        super.printProperties()
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
    paral.printProperties()
    print("Area is ${paral.area()}.")
}
