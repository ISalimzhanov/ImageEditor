package canvas

class GridDecorator(component: CanvasView) : CanvasDecorator(component) {
    override fun draw() {
        println("Grid was drawn")
        component.draw()
    }

    override fun changeShape(width: Int, length: Int) {
        println("Grid was reshaped")
        component.changeShape(width, length)
    }
}