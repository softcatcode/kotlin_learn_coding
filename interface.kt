import java.lang.Math.sin

interface GeomShape
{
    var name: String
    // functions may be implemented in interface
    fun printProperties() {
        println("Properties:")
    }
    fun area(): Double
}

class Parallelogram(x: Double, y: Double, a: Double): GeomShape
{
    // lateinit: initialized not imidiately but in init{}
    override lateinit var name: String

    var x: Double
    var y: Double
    var a: Double

    init {
        name = "parallelogram"
        this.x = x
        this.y = y
        this.a = a
    }

    override fun printProperties() {
        // in this case may be just super.printProperties()
        super<GeomShape>.printProperties()
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
    print("Area of this ${paral.name} is ${paral.area()}.")
}
