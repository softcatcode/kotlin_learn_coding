```Kotlin
fun ordinary_gcd(a: Int, b: Int): Int
{
    var x: Int = a
    var y: Int = b
    while (x != 0 && y != 0)
    {
        if (x > y)
            x %= y
        if (y > x)
            y %= x
    }
    return if (x == 0) y else x // lambda
}

fun gcdOfTwo(a: Int, b: Int): Int = when {
    a == 0 -> b
    b == 0 -> a
    a > b -> gcdOfTwo(a % b, b)
    else -> gcdOfTwo(b % a, a)
}

fun apply(f: (Int, Int) -> Int, a: Array<Int>): Int?
{
    if (a.size == 0)
        return null
    if (a.size == 1)
        return a[0]
    var result: Int = f(a[0], a[1])
    for (i: Int in 2 until a.size)
        result = f(result, a[i])
    return result
}

fun gcd(vararg ints: Int): Int? = apply(::gcdOfTwo, ints.toTypedArray()) // lambda
```
Сложные типы передаются по сылке, а простые - по значению.
