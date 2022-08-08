Оператор ```let``` позволяет обратиться к объекту выполнить какое-либо действие, связанное с ним.<br>
Слово ```it``` - ссылка на объект, причём через эту ссылку его нельзя изменить, то есть ```it = ...``` не сработает.
```Kotlin
class Cat(name: String, color: String)
{
    var name: String
    val color: String
    var age: Int

    init {
        this.name = name
        this.color = color
        age = 0
    }

    fun meow() {
        val n: Int = (10 - age) / 2
        for (i in 1..n)
            print("meow ")
    }
}

fun main()
{
    var c: Cat = Cat("__SoftFur", "grey")
    c.name.let {
        println("${it.removePrefix("__")}: meow")
    }

    Cat("mycat", "black-white").let {
        println("How 5 age cat meows:")
        it.age = 5
        it.meow()
    }
}
```
```
SoftFur: meow
How 5 age cat meows:
meow meow 
```
