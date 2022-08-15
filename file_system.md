# Работа с локальным хранилищем
## Запись
```Kotlin
val fstream: FileOutputStream = this.openFileOutput(fname, Context.MODE_PRIVATE) // open
fstream.write(str.toByteArray()) // save data
fstream.close() // close
```
## Чтение
```Kotlin
val fstream: FileInputStream = this.openFileInput(fname) // open
val str = fstream.readBytes().toString(Charsets.UTF_8) // get data
fstream.close() // close
```
# Работа с внешним хранилищем
Чтобы работать  внешним хранилищем, нужно запросить разрешение на его использование,<br>
а при попытке доступа проверять, не отозвано ли оно.
## Все необходимые проверки
```Kotlin
if (Environment.getExternalStorageState() != Environment.MEDIA_MOUNTED)
  return
val readStatus = ContextCompat.checkSelfPermissions(this, Manifest.permission.READ_EXTERNAL_STORAGE)
val writeStatus = ContextCompat.checkSelfPermissions(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
if (readStatus != PackageManager.PERMISSION_GRANTED || writeStatus != PackageManager.PERMISSION_GRANTED)
  return
```
## Запись
```Kotlin
val folder = Environment.getExternalStorageDirectory() // get folder path
val file = File(folder, fname) // open file
val bufWriter = BufferedWriter(FileWriter(file)) // need a writer
bufWriter.write(str) // writer saves data
bufWriter.close() // close
```
## Чтение
```Kotlin
val folder = Envirionment.gerExternalStorageDirectory() // get folder path
val file = File(folder, fname) // open file
file.getText() // reading
```
## Полезные свойства
С помощью полей ___freeSpace___ и ___totalSpace___ отслеживается объём свободного места папки и её размер.
```Kotlin
val folder = Environment.getExternalFileDirectory()
folder.freeSpace
folder.totalSpace
```
