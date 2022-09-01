```Kotlin
val callback = object: ItemTouchHelper.SimpleCallback(
    0,
    ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
) {
    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return false
    }
    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        TODO("implementation of action after swipe")
    }
}
val itemTouchHelper = ItemTouchHelper(callback)
itemTouchHelper.attachToRecyclerView(recyclerView)
```
__ItemTouchHelper.SimpleCallback__ - объект, следящий за изменением позиции пальца, скользящего по экрану и знает, что нужно делать: содердит<br>
все необходимые для этого методы.

___ItemTouchHelper___ реализует обработку swipe.

__attachRecyclerView__ прикрепляет обработчик swipe к нужному элементу.
