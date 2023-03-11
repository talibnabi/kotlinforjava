package lFirst

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    area(12, 34)
    forExample()
    forExample2("Hi", "Benjamin")
    val forExample3 = forExample3("Alisa", 20)
    println(forExample3)
    val forExample4 = forExample4();
    println(forExample4.toString())
    val forExample5 = forExample5()
    val forExample6 = forExample6()
    println("$forExample5,$forExample6")
}

fun area(width: Int, height: Int) {
    println("width: $width and height: $height")
}

fun forExample() {
    val def = "ananas".plus(" alma")
    println(def)
}

fun forExample2(def1: String, def2: String) {
    println(def1.plus(",").plus(def2))
}

fun forExample3(name: String, age: Int): String {
    return "name: $name,age: $age"
}

fun forExample4(): Example {
    return Example("Alisa", "Aslan", 20)
}

fun forExample5(): Char {
    return '4'
}

fun forExample6(): Boolean {
    return true;
}







