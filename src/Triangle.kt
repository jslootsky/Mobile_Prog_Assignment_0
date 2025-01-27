import kotlin.math.sqrt

open class Triangle(_name: String = "Triangle"): Shape(_name) {
    private var side1: Double = 0.0
    private var side2: Double = 0.0
    private var side3: Double = 0.0

    override fun printDimensions() {
        println("Side Length 1: $side1  Side Length 2: $side2  Side Length 3: $side3")
    }

    open fun setDimensions(newSide1: Double, newSide2: Double, newSide3: Double) {
        side1 = newSide1
        side2 = newSide2
        side3 = newSide3
    }

    override fun getArea(): Double {
        var s = (side1 + side2 + side3) / 2
        return sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }
}