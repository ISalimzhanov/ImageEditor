package canvas

fun main(){
    val canvas = CanvasView()
    val grid = GridDecorator(canvas)
    val rules = RulesDecorator(grid)
    rules.draw()
    rules.changeShape(512, 512)
}