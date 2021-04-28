package canvas

open class CanvasView(
    var width: Int,
    var length: Int,
) {
    open fun draw() {
        println("Canvas was drawn")
    }
    
    open fun changeShape(width: Int, length: Int) {
        println("Canvas was reshaped")
        this.width = width
        this.length = length
    }
}