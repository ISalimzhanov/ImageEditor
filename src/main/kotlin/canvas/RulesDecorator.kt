package canvas

class RulesDecorator(component: CanvasView) : CanvasDecorator(component) {
    override fun draw() {
        println("Rules was drawn")
        component.draw()
    }

    override fun changeShape(width: Int, length: Int) {
        println("Rules was reshaped")
        component.changeShape(width, length)
    }
}