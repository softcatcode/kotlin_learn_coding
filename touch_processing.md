Для обработки множественного касания, как и в случае с одиночным касанием необходимо переопределить метод ___onTouch___.<br>
Метод ___getActionMask___ возвратит одно из следующих статичесикх полей класса _MotionEvent_:<br>
* __ACTION_DOWN__ – срабатывает при касании первого пальца.<br>
* __ACTION_POINTER_DOWN__ – срабатывает при касании каждого последующего пальца.<br>
* __ACTION_MOVE__ – срабатывает при любом движении.<br>
* __ACTION_POINTER_UP__ – срабатывает при отпускании каждого пальца, кроме последнего.<br>
* __ACTION_UP__ – срабатывает при отпускании последнего пальца.<br>
Может быть обработано не более 10 пальцев.<br>
Методы ___getActionIndex___ и ___getPointerCount___ нужны для получения номера касания и их общего количества.
```Kotlin
 override fun onTouch(view: View, event: MotionEvent): Boolean {
        val actionMask = event.getActionMasked()
        val pointerIndex = event.getActionIndex()
        val pointerCount = event.getPointerCount()

        when (actionMask) {
            MotionEvent.ACTION_DOWN
            -> {
                // first touch
            }
            
            MotionEvent.ACTION_POINTER_DOWN 
            -> {
                // consequent touch
            }

            MotionEvent.ACTION_UP 
            -> {
                // interruption of the last touch
            }
            
            MotionEvent.ACTION_POINTER_UP 
            -> {
                // all touches interruption
            }

            MotionEvent.ACTION_MOVE 
            -> {
              `// motion
            }
        }
        return true
    }
```
