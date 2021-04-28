package canvas

fun main(){
    val canvas: CanvasView = CanvasView(256, 256)
    val grid = GridDecorator(canvas)
    val rules = RulesDecorator(grid)
    rules.draw()
}