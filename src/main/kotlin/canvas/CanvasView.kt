package canvas

open class CanvasView{
    open fun draw() {
        println("Canvas was drawn")
    }

    open fun changeShape(width: Int, length: Int) {
        println("Canvas was reshaped")
    }
}