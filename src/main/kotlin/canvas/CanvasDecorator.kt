package canvas

open class CanvasDecorator(
    val component: CanvasView,
) : CanvasView(component.width, component.length) {
    override fun draw() {
        component.draw()
    }

    override fun changeShape(width: Int, length: Int) {
        component.changeShape(width, length)
    }
}