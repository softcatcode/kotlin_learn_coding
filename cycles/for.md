# Перебор элементов

```Kotlin
for ((index, value) in array.withIndex())
    println("the element at $index is $value")

for (i in array.indices)
    println(array[i])

for (item: Int in ints) {
    print(item * item);
}
```

# Цикл со счётчиком
Счётчик рассматривается как локальная переменная.

```Kotlin
for (i: Int in 1..10)
	print(i + " ");
```
```
1 2 3 4 5 6 7 8 9 10
```

```Kotlin
for (i: Int in 1..10 step 2) {
	print(i + " ");
}
```
```
1 3 5 7 9
```

Тип счётчика можно не указывать.
```Kotlin
for (i in 1 until 10)
	print(i + " ");
```
```
1 2 3 4 5 6 7 8 9
```

```Kotlin
for (i in 3 until 12 step 3)
	print(i + " ");
```
```
3 6 9
```

```Kotlin
for (i in 10 downTo 5) {
	print(i + " ");
}
```
```
10 9 8 7 6 5
```

```Kotlin
for (i in 10 downTo 5 step 5)
	print(i + " ");
```
```
10 5
```
