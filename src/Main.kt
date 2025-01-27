
fun main() {
    val square: Shape = Square()
    val circle: Shape = Circle()
    val triangle: Shape = Triangle()
    val equilateralTriangle: Shape = EquilateralTriangle()

    print("Enter circle radius: ")
    (circle as Circle).setDimensions(readln().toDouble())

    print("Enter square length: ")
    val length: Double = readln().toDouble()
    print("Enter square width: ")
    val width: Double = readln().toDouble()
    (square as Square).setDimensions(length, width)

    print("Enter triangle side length 1: ")
    val side1: Double = readln().toDouble()
    print("Enter triangle side length 2: ")
    val side2: Double = readln().toDouble()
    print("Enter triangle side length 3: ")
    val side3: Double = readln().toDouble()
    (triangle as Triangle).setDimensions(side1, side2, side3)

    print("Enter equilateral triangle side length: ")
    val side: Double = readln().toDouble()
    (equilateralTriangle as EquilateralTriangle).setDimensions(side)

    println("\n-------------------------DIMENSIONS-------------------------")

    print("Circle: ")
    circle.printDimensions()
    print("Square: ")
    square.printDimensions()
    print("Triangle: ")
    triangle.printDimensions()
    print("Equilateral Triangle: ")
    equilateralTriangle.printDimensions()

    println("\n-------------------------AREAS-------------------------")

    println("Circle Area: ${circle.getArea()}")
    println("Square Area: ${square.getArea()}")
    println("Triangle Area: ${triangle.getArea()}")
    println("Equilateral Triangle Area: ${equilateralTriangle.getArea()}")


}