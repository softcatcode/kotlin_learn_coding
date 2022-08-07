# Объявление enum
```Kotlin
enum class ZooAnimal
{
    LION, BEAR, ELEPHANT, CAMEL, TORTOISE;
    fun formatName(): String {
        return name.toLowerCase().capitalize()
    }
}

fun main()
{
    val animal: ZooAnimal = ZooAnimal.LION
    println(animal.name)
    print(animal.formatName())
}
```

```
LION
Lion
```
