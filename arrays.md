# Объявление
```Kotlin
var a: Array<Int> = arrayOf(1, 2, 3, 4, 5) // fixed-size array
var b: List<Int> = listOf(1, 2, 3, 4, 5) // immutable array: b[i] -> O(1)
// time(b[i]) > time(a[i])
var c: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
c.add(0) // mutable size, c[i] -> O(1)
var d: LinkedList<Int> = LinkedList() // mutable list, d[i] -> O(n)
```
___Array___: массив фиксированного размера с возможностью изменения значения элементов.<br>
___List___: массив фиксированного размера ___без___ возможности изменения значения элементов.<br>
___MutableList___: динамический массив.<br>
___LinkedList___: список.

# Иницилизация
```Kotlin
var a: Array<Int> = Array(10, {it * 2})
for (el: Int in a)
    print("${el} ")
println()

val n: Int = 5;
var b: Array<Int> = Array(n, {it + 1})
for (el: Int in b)
    print("${el} ")
println()

var linlist: LinkedList<Int> = LinkedList<Int>().apply {
    for (el in b)
        add(el * el)
}
for (el: Int in linlist)
    print("${el} ")

```
```
0 2 4 6 8 10 12 14 16 18
1 2 3 4 5
1 4 9 16 25
```
