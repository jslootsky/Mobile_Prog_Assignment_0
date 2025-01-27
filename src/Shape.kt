abstract class Shape(_name: String): Dimensionable {
    var _name = _name

    open fun getArea(): Double {
        return 0.0
    }
}