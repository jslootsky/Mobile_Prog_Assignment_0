class Circle(): Shape("Circle:") {
    private var radius: Double = 0.0

    override fun printDimensions() {
        println("Radius: $radius")
    }

    fun setDimensions(newRadius: Double) {
        radius = newRadius
    }

    override fun getArea(): Double {
        return radius * radius * Math.PI
    }
}