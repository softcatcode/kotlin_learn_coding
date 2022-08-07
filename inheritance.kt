import java.lang.Math.sin

val pi: Double = 3.14159265358979323846264338327950

interface GeomShape
{
    var name: String
    // functions may be implemented in interface
    fun printProperties() {
        println("Properties:")
    }
    fun area(): Double
}

open class Parallelogram(x: Double, y: Double, a: Double): GeomShape
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

open class Rectangle(x: Double, y: Double) : Parallelogram(x, y, pi / 2)
{
    override var name: String = "rectangle"

    override fun printProperties() {
        super.printProperties()
        println("Adjacent sides are equal.")
        println("Adjacent angles are equal.")
        println("Every angle is 90 deg.")
    }

    override fun area(): Double { // simplifying area calculation
        return x * y
    }
}

fun main()
{
    var rect = Rectangle(1.0, 2.0)
    rect.printProperties()
    print("Area of this ${rect.name} is ${rect.area()}.")
}
