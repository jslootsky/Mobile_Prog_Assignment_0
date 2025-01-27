import javax.swing.Spring.height

class Square(): Shape("Square") {
    private var length: Double = 0.0
    private var width: Double = 0.0

    override fun printDimensions() {
        println("Length: $length\tWidth: $width")
    }

    fun setDimensions(newLength: Double, newWidth: Double) {
        length = newLength
        width = newWidth
    }

    override fun getArea(): Double {
        return length * width
    }
}